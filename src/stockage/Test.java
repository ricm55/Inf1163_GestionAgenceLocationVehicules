package stockage;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import background.Client;
import background.PermisDeConduire;
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
        /*
        try {
            Client c = StockageClients.getClient( "819-332-5484" );
            System.out.println(c);
            
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch ( ParseException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        /*try {
            
            Client c = new Client(-1,"Rivard","Jean-Denis","819-332-5484",java.time.LocalDate.now(),"DenisLeJean@gmail.com",new Date(1999,8,11),"La street des boeufs",true);
            PermisDeConduire permis = new PermisDeConduire(new Date(2025,06,22), new ArrayList<String>() { {add("CLASSE1");add("CLASSE2");add("CLASSE6B");} } );
            c.setPermis( permis );
            StockageClients.insertClient( c );
            
        } catch ( Exception e ) {
            // TODO Auto-generated catch block
        }*/
        
    }

}