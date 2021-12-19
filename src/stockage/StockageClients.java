package stockage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import background.Client;
import background.PermisDeConduire;
import constante.ClasseVehicule;
import models.ModeleClient;

import errorHandler.*;

import java.util.concurrent.TimeUnit;


public class StockageClients{

    public StockageClients() {

    }
    
    /*
     * Obtenir un client a partir d'un numero de telephone
     * */
    public static Client  getClient(String numTelephone) throws SQLException, ParseException {
        //Connection avec la base de donnee
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        
        //Creation et execution de la commande
        String query_getClient = MessageFormat.format( "select * from client inner join PermisConduire on Client.ClientId = PermisConduire.client_id where numTelephone=\"{0}\";", numTelephone );
        ResultSet result_getClient = statement.executeQuery(query_getClient);
        
        System.out.println(query_getClient);
        
        try {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
 
            //Obtenir le client
            Client client = new Client(
                    result_getClient.getInt("ClientId"),
                    result_getClient.getString( "nom" ),
                    result_getClient.getString( "prenom" ),
                    result_getClient.getString( "numTelephone" ),
                    StockageBasic.converterStringDate( result_getClient.getString( "dateCreation" ) ).toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    result_getClient.getString( "courriel" ),
                    simpleDateFormat.parse(result_getClient.getString( "dateDeNaissance" ) ),
                    result_getClient.getString( "adresse" ),
                    result_getClient.getBoolean( "assurancePersonnelle" )
                    );  
            //Date dateExpiration = StockageBasic.converterStringDate(result_getClient.getString("dateExpiration"));
            Date dateExpiration = simpleDateFormat.parse( result_getClient.getString("dateExpiration") );
            
            //Obtenir le permis du client
            String query_getPermisType = MessageFormat.format( "select type from PermisConduireClassePermis inner join ClassePermis on PermisConduireClassePermis.classePermis_id = ClassePermis.ClassePermisId where permisConduire_id={0};",result_getClient.getInt("ClientId"));
            ResultSet result_getPermisType = statement.executeQuery(query_getPermisType);
            
            ArrayList<String> types = new ArrayList<String> ();
            while(result_getPermisType.next()) {
                types.add( result_getPermisType.getString( "type" ) );
            }
            PermisDeConduire permisDuClient = new PermisDeConduire( dateExpiration, types);
            
            client.setPermis( permisDuClient );
            //Se deconnection de la base de donnee
            StockageBasic.disconnect();
            return client;
        
        }catch( SQLException e) {
            //Il n'y a pas de client
            return null;
        }
    }
    
    /*
     * Insertion d'un client
     * */
    public static void insertClient(Client client) throws SQLException, ParseException, CustomException{
        System.out.println("INSERTION d'un client");
        
        //Verifier s'il n'y a pas un client avec le meme numero
        if( getClient(client.getNumTelephone())!=null) {
            throw new CustomException("Le client existe deja");
        }
        
        //Connection a la base de donnee
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        int annee = client.getDateDeNaissance().getYear();
        
        //Commande pour inserer un client
        String query_insertClient = MessageFormat.format( 
                "INSERT INTO Client VALUES " + 
                "( ?, \"{0}\", \"{1}\",\"{2}\",\"{3}\",\"{4}\",\"{5}-{6}-{7}\",\"{8}\",{9});", 
                client.getNom(),
                client.getPrenom(),
                client.getNumTelephone(),
                client.getDateCreation(),
                client.getCourriel(),
                String.valueOf( client.getDateDeNaissance().getYear()),
                client.getDateDeNaissance().getMonth(),
                client.getDateDeNaissance().getDay(),
                client.getAdresse(),
                client.isAssurancePersonnelle());
        
        //Inserer le client
        statement.executeUpdate(query_insertClient);
        System.out.println("=> "+ query_insertClient);
        
        //Recuperer l'id du client
        String query_getClientId = MessageFormat.format( "select ClientId from Client where numTelephone=\"{0}\";", client.getNumTelephone() );
        ResultSet result_getClientId= statement.executeQuery(query_getClientId);
        int ClientId = result_getClientId.getInt( "ClientId" );
        System.out.println( "=> " + query_getClientId );
        
        
        //Inserer le permis du client
        String query_insertPermisClient = MessageFormat.format( 
                "INSERT INTO PermisConduire VALUES "
                + "((select ClientId from Client where numTelephone=\"{0}\"),\"{1}-{2}-{3}\");",  
                client.getNumTelephone(),String.valueOf( client.getPermis().getDateExpiration().getYear() ),
                client.getPermis().getDateExpiration().getMonth(),
                client.getPermis().getDateExpiration().getDay());
        System.out.println(query_insertPermisClient);
        statement.executeUpdate(query_insertPermisClient);
        System.out.println("=> "+query_insertPermisClient);
        
        //Mettre une classe au permis
        //String query_insertClassePermis = MessageFormat.format( "", arguments )
        String query_insertClassePermis = "insert into PermisConduireClassePermis values ";
        for (String type : client.getPermis().getClasses()) {
            String query_suite = MessageFormat.format( "((SELECT client_id from PermisConduire where client_id={0}),(SELECT ClassePermisId from ClassePermis where type=\"{1}\")),", ClientId,type );
            query_insertClassePermis = query_insertClassePermis + query_suite;
        }
        //Finir la query avec un ;
        query_insertClassePermis = query_insertClassePermis.substring(0,query_insertClassePermis.length() - 1) + ';';
        System.out.println("DEBUG => "+query_insertClassePermis);
        statement.executeUpdate(query_insertClassePermis);
        System.out.println("=> "+query_insertClassePermis);
        
        
    }
    

}
