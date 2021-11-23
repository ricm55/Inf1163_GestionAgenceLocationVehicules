/*
 * Ce fichier contient tous les codes d'erreurs dans l'application
 * */

package constante;

public interface ErrorCodes {
    String DATABASE_CONNECTION_ERROR = "Connection a la base de donnee impossible";
    String DATABASE_INCOMPATIBLE = "Certains elements tel que les tables ou attributs n'existe pas dans la base de donnee";
    
    String VALIDATION_PERMI_DATE = "Le permi de conduite du client est expiree";
    String VALIDATION_CLASSE_VEHICULE = "Le client n'a pas la bonne classe pour le vehicule desiree";
    
}
