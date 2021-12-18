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
    public List<Client>  getClients() throws SQLException {
            
        List<Client> clients = new ArrayList<Client>();
        Connection storage = super.connect();
        Statement statement = storage.createStatement();
        
        //ResultSet result = statement.executeQuery("select * from Client;");
        String query_getClient = "SELECT ClientId, nom,prenom,numTelephone,dateCreation,courriel,dateDeNaissance,adresse,"
                    + "assurancePersonnelle,dateExpiration "
                    + "from Client "
                    + "inner join PermisConduire on Client.ClientId = PermisConduire.client_id ";
                    //+ "WHERE numTelephone=\"819-556-4525\";";
            
        ResultSet result_client = statement.executeQuery(query_getClient);
        
        while(result_client.next()) {
            
            //Creer le client
            Client client = new Client (
                result_client.getInt( "ClientId" ),
                result_client.getString( "nom" ),
                result_client.getString( "prenom" ),
                result_client.getString( "numTelephone" ),
                result_client.getDate( "dateCreation" ),
                result_client.getString( "courriel" ),
                result_client.getDate( "dateDeNaissance" ),
                result_client.getString( "adresse" ),
                result_client.getBoolean( "assurancePersonnelle" )
                );
            //Ajouter le client a la liste
            clients.add( client );
            
        }
        
        //Faire liste vide des classes du client
        ArrayList<String> typePermis = new ArrayList<String>();
        
        //Commande permettant d'obtenir les types du permis de l'utilisateur
        String query_type_permis = String.format( "SELECT type FROM PermisConduireClassePermis " 
                                                  + "inner join ClassePermis on PermisConduireClassePermis.classePermis_id = ClassePermis.ClassePermisId " 
                                                  + "where permisConduire_id=%d;",
                                                  result_client.getInt( "ClientId" ));
        
        //Executer la commande
        ResultSet result_type_permis = statement.executeQuery(query_type_permis);
        
        //Lire tous les types de l'utilisateur
        while(result_type_permis.next()) {
            
            typePermis.add(result_type_permis.getString( "type" ));
        }
        
        //Creer le permis de l'utilisateur
        PermisDeConduire permis_client = new PermisDeConduire(result_client.getDate( "dateExpiration" ),typePermis);
        
        //Se deconnecter de la database    
        disconnect(storage);
        return clients;
        }*/
    
    /*
     * Obtenir les informations d'un seul utilisateur
     * */
    /*public static Client getClient(String numTelephone) throws SQLException {
        //Connection a la base de donnee
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        
        //Definir la commande pour obtenir l'utilisateur
        String query_getClient = String.format(
                "SELECT ClientId, nom,prenom,numTelephone,dateCreation,courriel,dateDeNaissance,adresse,"
                + "assurancePersonnelle,dateExpiration "
                + "from Client "
                + "inner join PermisConduire on Client.ClientId = PermisConduire.client_id "
                + "WHERE numTelephone=%s;",numTelephone);
        
        //Executer la commande de la base de donnee
        ResultSet result_client = statement.executeQuery(query_getClient);
        
        result_client.next();
        //Creer le client
        Client client = new Client(
                result_client.getInt( "ClientId" ),
                result_client.getString( "nom" ),
                result_client.getString( "prenom" ),
                result_client.getString( "numTelephone" ),
                result_client.getDate( "dateCreation" ),
                result_client.getString( "courriel" ),
                result_client.getDate( "dateDeNaissance" ),
                result_client.getString( "adresse" ),
                result_client.getBoolean( "assurancePersonnelle" )
                );
        
        //Se deconnecter de la base de donnee
        StockageBasic.disconnect();
        
        return client;
    }*/
    /*
     * public static ModeleClient getClient(int id) throws SQLException {
     * connect(); Statement statement = conn.createStatement(); String sql =
     * MessageFormat.format( "select * from client where id={0};", id );
     * ResultSet result = statement.executeQuery(sql); ModeleClient client = new
     * ModeleClient( result.getInt("id"), result.getString( "name" ),
     * result.getString( "email" ) ); disconnect();
     * 
     * return client; }
     * 
     * public static void insertClient(ModeleClient c) throws SQLException{
     * 
     * connect(); Statement statement = conn.createStatement(); String sql =
     * MessageFormat.format("insert into client values (?,\"{0}\",\"{1}\");",c.
     * getName(),c.getEmail()); statement.executeUpdate(sql); disconnect(); }
     * public static void updateClient(ModeleClient c) throws SQLException{
     * connect(); Statement statement = conn.createStatement(); String sql =
     * MessageFormat.
     * format("update client set name=\"{0}\", email=\"{1}\" where id={2};",c.
     * getName(),c.getEmail(),c.getId()); statement.executeUpdate(sql);
     * disconnect(); }
     */
    public static Client  getClient(String numTelephone) throws SQLException, ParseException {
        //Connection avec la base de donnee
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        
        //Creation et execution de la commande
        String query_getClient = MessageFormat.format( "select * from client inner join PermisConduire on Client.ClientId = PermisConduire.client_id where numTelephone=\"{0}\";", numTelephone );
        ResultSet result_getClient = statement.executeQuery(query_getClient);
        
        System.out.println(query_getClient);
        
        try {
        
            //Obtenir le client
            Client client = new Client(
                    result_getClient.getInt("ClientId"),
                    result_getClient.getString( "nom" ),
                    result_getClient.getString( "prenom" ),
                    result_getClient.getString( "numTelephone" ),
                    converterStringDate( result_getClient.getString( "dateCreation" ) ).toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    result_getClient.getString( "courriel" ),
                    converterStringDate( result_getClient.getString( "dateDeNaissance" ) ),
                    result_getClient.getString( "adresse" ),
                    result_getClient.getBoolean( "assurancePersonnelle" )
                    );  
            Date dateExpiration = converterStringDate(result_getClient.getString("dateExpiration"));
    
            
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
    
    private static Date converterStringDate(String chaine) {
        
        String[] sections_date = chaine.split( "-" );
        
        int annee = Integer.parseInt(sections_date[0]);
        int mois = Integer.parseInt(sections_date[1]);
        int jour = Integer.parseInt(sections_date[2]);
        
        return new Date(annee,mois,jour);
    }

}
