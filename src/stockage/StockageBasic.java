package stockage;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import background.Client;
import models.ModeleClient;

public class StockageBasic {
    

    private static String dbPath = new File("database/GestionAgenceLocationVehicules.db").getAbsolutePath();
	public static Connection storage = null;


    protected static void connect() throws SQLException 
    {
        storage = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
    }
    
    protected static void disconnect() throws SQLException 
    {
        storage.close();
    }
    
    
    
}

/*on va vouloir une liste des locations courantes avec les noms des clients reliés, mais pas tous les clients
 * 
 * 
 * */
