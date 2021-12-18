package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;

import background.ClasseDeVehicule;
import background.Vehicule;

public class StockageVehicule {
    
    public static  ArrayList<Vehicule> getVehicules(String categorie) throws SQLException {
        StockageBasic.connect();
        Statement statement = StockageBasic.storage.createStatement();
        
        ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>(); 
        
        //Faire la commande d'obtention des vehicules
        try {
            //Creation et execution de la commande pour obtenir les vehicules
            String query_getVehicules = MessageFormat.format( "select * from vehicule inner join ClassePermis on Vehicule.classePermis_id = ClassePermis.ClassePermisId where categorie=\"{0}\";", categorie );
            ResultSet result_getVehicule = statement.executeQuery(query_getVehicules);
            System.out.println("=>"+query_getVehicules);
            
            //String marque, String modele, int annee, String couleur, int kilometrage, double niveauReservoir, boolean disponible, String classe)
            while(result_getVehicule.next()) {
                Vehicule vehicule = new Vehicule(
                        result_getVehicule.getString( "type" ),
                        result_getVehicule.getString( "marque" ),
                        result_getVehicule.getString( "modele" ),
                        result_getVehicule.getInt( "annee" ),
                        result_getVehicule.getString( "couleur" ),
                        result_getVehicule.getDouble( "kilometrage" ),
                        result_getVehicule.getDouble( "quantiteEssence" ),
                        result_getVehicule.getBoolean( "disponible" ),
                        result_getVehicule.getString( "categorie" )
                        );
                //Ajouter un vehicule
                vehicules.add( vehicule );
            }
            
        }catch(SQLException e){
            //Aucun vehicule trouve
            return null;
        }
        
        StockageBasic.disconnect();
        return vehicules;
        
    }
}
