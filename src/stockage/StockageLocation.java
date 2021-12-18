package stockage;

import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class StockageLocation {

    
    public static void insertLocation() throws SQLException {
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        
        
        StockageBasic.disconnect();
        
    }

}
