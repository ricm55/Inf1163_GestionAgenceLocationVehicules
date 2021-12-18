package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import background.Client;
import background.Location;
import background.Vehicule;

public class StockageLocation {

    
    public static void insertLocation(Location location) throws SQLException {
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        
        Client client = location.getClient();
        Vehicule vehicule = location.getVehicule();
        
        //Get date of today
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDateTime now = LocalDateTime.now();  
        String todayDate = dtf.format(now);
        
        //Creer une commande pour inserer une location
        //String query_insertLocation = "insert into location values (?,(select ClientId from client where numTelephone=\"{0}\"), (select VehiculeId from Vehicule where marque=\"Honda\" AND modele=\"Civic\" AND annee=2007),\"2021-02-05\",220.5,50.24,null,20.2,null,true);";
        String query_insertLocation = MessageFormat.format( 
                "insert into location values "
                + "(?,(select ClientId from client where numTelephone=\"{0}\"), "
                + "(select VehiculeId from Vehicule where marque=\"{1}\" AND modele=\"{2}\" AND annee={3}),"
                + "\"{4}\",{5},{6},{7}-{8}-{9},{10},{11},true);",  
                client.getNumTelephone(),
                vehicule.getMarque(),vehicule.getModele(),String.valueOf( vehicule.getAnnee() ),
                todayDate,
                vehicule.getKilometrage(), vehicule.getNiveauReservoir(),
                String.valueOf( location.getDateFin().getYear() ),location.getDateFin().getMonth(),location.getDateFin().getDay(),
                location.getPremierVersement(),location.getDeuxiemeVersement()
                );
        statement.executeUpdate(query_insertLocation);
        System.out.println("=>"+query_insertLocation);
        
        //Creer la commande pour associer les tarifs a la location
        /*
        insert into TarifLocation values
        ((select TarifId from tarif where type="A"),(select locationId from Location where vehicule_id= (select VehiculeId from Vehicule where marque="Honda" AND modele="Civic" AND annee=2007)));
        */
        
        String query_insertTarifLocation =  "insert into TarifLocation values ";
        String query_getLocationId = MessageFormat.format(
                "(select locationId from Location where vehicule_id= "
                + "(select VehiculeId from Vehicule where marque=\"{0}\" AND modele=\"{1}\" AND annee={2}))),",
                vehicule.getMarque(),vehicule.getModele(),String.valueOf( vehicule.getAnnee() ));
        
        
        for (String t : location.getTarifApplicable()) {
            String query_suite = MessageFormat.format( "((select TarifId from tarif where type=\"{0}\"),", t );
            
            query_insertTarifLocation = query_insertTarifLocation + query_suite + query_getLocationId;
        }
        
        query_insertTarifLocation = query_insertTarifLocation.substring(0,query_insertTarifLocation.length() - 1) + ';';
                
        statement.executeUpdate(query_insertTarifLocation);
        System.out.println("=> " + query_insertTarifLocation);
        
        StockageBasic.disconnect();
        
    }
    
    public static Location getLocation(String numTelephone) throws SQLException {
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        
        //Creer la commande pour obtenir la location
        String query_getLocation = MessageFormat.format( 
                "select * from location " + 
                "inner join Client on Client.ClientId = Location.client_id = Client.ClientId " + 
                "inner join Vehicule on location.vehicule_id = Vehicule.VehiculeId " + 
                "inner join ClassePermis on Vehicule.classePermis_id = ClassePermis.ClassePermisId " + 
                "where numTelephone=\"{0}\";",  
                numTelephone);
        ResultSet resultSet_getLocation = statement.executeQuery( query_getLocation );
        System.out.println("=> " + query_getLocation);
        
        //public Client(int id, String nom, String prenom, String numTelephone, LocalDate dateCreation,String courriel,Date dateDeNaissance, String adresse, boolean assurancePersonnelle)
        //public Vehicule(String typeDePermisNecessaire,String marque, String modele, int annee, String couleur, double kilometrage, double niveauReservoir, boolean disponible, String classe)
        int locationId = resultSet_getLocation.getInt("LocationId");
        
        Location location = new Location(
                new Client(
                        resultSet_getLocation.getInt("ClientId"),
                        resultSet_getLocation.getString( "nom" ),
                        resultSet_getLocation.getString( "prenom" ),
                        resultSet_getLocation.getString( "numTelephone" ),
                        StockageBasic.converterStringDate( resultSet_getLocation.getString( "dateCreation" ) ).toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        resultSet_getLocation.getString( "courriel" ),
                        StockageBasic.converterStringDate( resultSet_getLocation.getString( "dateDeNaissance" ) ),
                        resultSet_getLocation.getString( "adresse" ),
                        resultSet_getLocation.getBoolean( "assurancePersonnelle" )
                        ),
                StockageBasic.converterStringDate( resultSet_getLocation.getString( "dateDebut" ) ),
                StockageBasic.converterStringDate( resultSet_getLocation.getString( "dateFin" ) ),
                new Vehicule(
                        resultSet_getLocation.getString( "type" ),
                        resultSet_getLocation.getString( "marque" ),
                        resultSet_getLocation.getString( "modele" ),
                        resultSet_getLocation.getInt( "annee" ),
                        resultSet_getLocation.getString( "couleur" ),
                        resultSet_getLocation.getDouble( "kilometrage" ),
                        resultSet_getLocation.getDouble( "quantiteEssence" ),
                        resultSet_getLocation.getBoolean( "disponible" ),
                        resultSet_getLocation.getString( "categorie" )
                        )
                );
        
        //Creer la commande pour obtenir les tarifs de la location
        String query_getTarifLocation = MessageFormat.format( "select * from TarifLocation inner join Tarif on TarifLocation.tarif_id = Tarif.TarifId where location_id={0};", locationId );
        ResultSet resultSet_GetTarifLocation = statement.executeQuery( query_getLocation );
        System.out.println("=> " + query_getTarifLocation);
        
        ArrayList<String> tarifApplicable = new ArrayList<String>();
        while(resultSet_GetTarifLocation.next()) {
            tarifApplicable.add( resultSet_GetTarifLocation.getString( "type" ) );
        }
        
        location.setTarifApplicable( tarifApplicable );
        
        StockageBasic.disconnect();
        return location;
    }

}
