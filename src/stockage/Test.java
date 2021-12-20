package stockage;

import java.sql.SQLException;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import InterfaceGraphique.InterfaceAccueil;
import background.Client;
import background.Forfait;
import background.Location;
import background.PermisDeConduire;
import background.Vehicule;
import models.ModeleClient;

public class Test {


    public static void main( String[] args ) {
        /*StockageClients stk = new StockageClients();
        try {
            List<Client> mc= stk.getClients();
            
            for(Client client: mc) {
                
                System.out.println(client.getId() + " - " + client.getCourriel() + " - " + client.getPermis());
            }
            
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        //StockageClients stk = new StockageClients();
        
        /*try {
            Client c = StockageClients.getClient( "6234562890" );
            System.out.println(c);
            
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch ( ParseException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }*/
/*
        try {

            PermisDeConduire permis = new PermisDeConduire(new Date(2025,06,22), new ArrayList<String>() { {add("CLASSE1");add("CLASSE2");add("CLASSE6B");} } );

            LocalDate dateCreation = LocalDate.now();
            
            Client c = new Client("TestNom","TestPrenom","473746284",dateCreation,"test@gmail.com",new Date(1999,8,11),"Rue des Benoits",true,permis);
             //Client d = new Client(-1,"TestNom","TestPrenom","1234567890",java.time.LocalDate.now(),"test@gmail.com",new Date(1999,8,11),"Rue des Benoits",true);
	
            StockageClients.insertClient( c );
            //InterfaceAccueil.launch();
            
        } catch ( Exception e ) {
            System.out.println("Erreur => " + e.getMessage());
        }
*/
        
        //try {
/*
        
        try {
            ArrayList<Vehicule> listeVehicules = StockageVehicule.getVehicules( "Economique" );
            for(Vehicule v:listeVehicules) {
                System.out.println(v);
            }
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            System.out.println("ca plante");
        }

        */
        //public Location(Client client, Date dateDebut, Date dateFin, Forfait forfait, Vehicule vehicule)
       /*Client c;
        try {
            //Get date of today
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
            LocalDateTime now = LocalDateTime.now();  
 
            
            c = StockageClients.getClient( "6234562890" );
            
            ArrayList <String> tarifApplicable = new ArrayList <String>();
            tarifApplicable.add( "A" );
            tarifApplicable.add( "F" );
            tarifApplicable.add( "G" );
            
            Location location = new Location(c,new Date(2021,04,02),new Date(2021,06,02),new Vehicule("Toyota","Avalon",2020), tarifApplicable);
            
            StockageLocation.insertLocation( location );
            
            //StockageLocation.insertLocation( location, tarif );
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch ( ParseException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
 /*
        try {
            Location l = StockageLocation.getLocation( "6234562890" );
            System.out.println(l);
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        /*
        try {
            double tarif = StockageLocation.getTarifPrix("A");
            System.out.println(tarif);
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
        /*
        try {
            StockageTarif.updateTarifPrix( 56.98, "A" );
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
        //StockageLocation.insertLocation( location,  );
        
        /*
        try {
            Client c = StockageClients.getClient( "6234562890" );
            System.out.println(c.getDateDeNaissance() + " " + c.getPermis().getDateExpiration());
        
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch ( ParseException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        *//*
        Vehicule v = new Vehicule("Mazda","2",2011);
        try {
            StockageVehicule.updateVehiculeDispo( v, true);
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        
        try {
            ArrayList<Vehicule> listeVehicule = StockageVehicule.getVehicules( "Economique" );
            for (Vehicule v : listeVehicule ) {
                System.out.println(v);
            }
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

}
