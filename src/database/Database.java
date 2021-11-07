package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import models.Client;

public class Database {
    
    private static String jdbcUrl = "jdbc:sqlite:C:\\Users\\marca\\OneDrive\\Workspace\\eclipse_Workspace\\Inf1163_GestionAgenceLocationVehicules\\database\\GestionAgenceLocationVehicules.db";
    private static Connection conn = null;
    
    private static void connect() throws SQLException 
    {
        conn = DriverManager.getConnection(jdbcUrl);
    }
    
    private static void disconnect() throws SQLException 
    {
        conn.close();
    }
    
    public static List<Client>  getClients() throws SQLException {
        
        List<Client> clients = new ArrayList<Client>();
        connect();
        Statement statement = conn.createStatement();
        
        ResultSet result = statement.executeQuery("select * from client;");
        while(result.next()) {
            Client client = new Client (
                    result.getInt( "id" ),
                    result.getString( "name" ),
                    result.getString( "email" )
                    );

            clients.add( client );
        }
        
        disconnect();
        return clients;
    }
    
    public static Client  getClient(int id) throws SQLException {
        connect();
        Statement statement = conn.createStatement();
        String sql = MessageFormat.format( "select * from client where id={0};", id );
        ResultSet result = statement.executeQuery(sql);
        Client client = new Client(
                result.getInt("id"),
                result.getString( "name" ),
                result.getString( "email" )
                );
        disconnect();
       
        return client;
    }
    
    public static void insertClient(Client c) throws SQLException{
        
        connect();
        Statement statement = conn.createStatement();
        String sql = MessageFormat.format("insert into client values (?,\"{0}\",\"{1}\");",c.getName(),c.getEmail());
        statement.executeUpdate(sql);
        disconnect();
    }
    public static void updateClient(Client c) throws SQLException{
        connect();
        Statement statement = conn.createStatement();
        String sql = MessageFormat.format("update client set name=\"{0}\", email=\"{1}\" where id={2};",c.getName(),c.getEmail(),c.getId());
        statement.executeUpdate(sql);
        disconnect();
    }
    
}
