package InterfaceGraphique;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import database.Database;
import models.ModeleClient;
import background.Vehicule;
import constante.ClasseVehicule;
import background.Client;
import background.Forfait;
import background.Location;
import background.PermisDeConduire;
import controleur.CreerLocationControleur;

public class Main {

    public static void main( String[] args ) {
        /*
        Vehicule vehicule = new Vehicule("Hyndai","Accent",2011, "Rouge",320000,34.65, true,ClasseVehicule.CLASSE1);
        PermisDeConduire permi = new PermisDeConduire(new Date(2023,6,22), ClasseVehicule.CLASSE1);
        Client client = new Client("Jonhson", new Date(1999,4,12),"123 rue des Johnsons", "123-1234-5678",true, permi);
        Forfait forfait = new Forfait("Forfait 1", 32.55);
        
        try {
            CreerLocationControleur loc = new CreerLocationControleur(vehicule,client, forfait );    
        }catch(Exception err){
          System.out.println(err);
        }
        
        RechercheClient rc = new RechercheClient();
        InterfaceAccueil frame = new InterfaceAccueil();
        rc.launch();
        //frame.launch();
        
       /* ClasseVehicule Cv = ClasseVehicule.CLASSE1 ;
        PermisDeConduire Ptest = new PermisDeConduire(new Date(2023,8,8),Cv);
        Client ClientTest = new Client("Marilou Fugere", new Date(1997,01,01),"123 Chemin Chelsea","8191234567",false, Ptest);*/
        		 
        
        /*
        //Creer vehicule
        System.out.println("Creation d'un vehicule");
        Vehicule vehicule = new Vehicule("Hyndai","Accent",2011, "Rouge",320000,34.65, true);
        
        //Creer un permi
        System.out.println("Creation d'un permi");
        PermisDeConduire permi = new PermisDeConduire(new Date(2023,6,22), "Classe 1");
        
        //Creer client
        Client client = new Client("Jonhson", new Date(1999,4,12),"123 rue des Johnsons", "123-1234-5678",true, permi);
        
        //Creer un forfait
        Forfait forfait = new Forfait("Forfait 1", 32.55);
        
        //Creer location
        Location location = new Location(client,new Date(),new Date(2021,12,4),forfait, vehicule);
        
        //Afficher les informations sur la location
        
        System.out.println(location);
        */
        /*System.out.println("First init");
        
        try {
            //********* INSERT DANS LA DB ******************************
            /*Client c = new Client("Marki","marki@email.com");
            Database.insertClient( c );*/
            //********* UPDATE DANS LA DB ******************************
            /*Client c = Database.getClient( 4 );
            c.setName( "Gab" );
            Database.updateClient( c );*/
            
            //********* GET UN SEUL CLIENT ******************************
            /*Client c2 = Database.getClient( 3 );
            System.out.println(c2);*/
            //********* GET PLUSIEURS CLIENTS ******************************
          /*  System.out.println("********* LA DATABASE ************");
            List<ModeleClient> clients = Database.getClients();
            for(ModeleClient client: clients) {
                System.out.println(client.getId() + " " + client.getName() + " " + client.getEmail());
            }
           
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }
}
