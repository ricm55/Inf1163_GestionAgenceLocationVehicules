package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class StockageTarif {

    /*
     * Permet d'obtenir le chiffre d'un tarif a partir d'une categorie
     * */
    public static double getTarifPrix(String type) throws SQLException {
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        
        String query_getTarifPrix = MessageFormat.format( "select prix from tarif where type=\"{0}\";", type );
        System.out.println("=> " + query_getTarifPrix);
        ResultSet resultSet_getTarifPrix = statement.executeQuery(query_getTarifPrix );
        
        
        double tarif = resultSet_getTarifPrix.getDouble( "prix" );
        
        StockageBasic.disconnect();
        return tarif;
    }
    
    /*
     * Permet d'update un prix dans la db
     * */
    public static void updateTarifPrix(double prix, String type) throws SQLException {
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        
        String query_updateTarifPrix = MessageFormat.format( "UPDATE tarif SET prix = {0} WHERE type=\"{1}\";", prix, type );
        statement.executeUpdate( query_updateTarifPrix );
        System.out.println("=> " + query_updateTarifPrix);
        
        StockageBasic.disconnect();
    }


}
