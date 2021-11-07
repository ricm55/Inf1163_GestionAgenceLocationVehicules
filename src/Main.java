import java.sql.SQLException;
import java.util.List;
import database.Database;
import models.Client;

public class Main {

    public static void main( String[] args ) {
        System.out.println("First init");
        
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
            System.out.println("********* LA DATABASE ************");
            List<Client> clients = Database.getClients();
            for(Client client: clients) {
                System.out.println(client.getId() + " " + client.getName() + " " + client.getEmail());
            }
           
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
