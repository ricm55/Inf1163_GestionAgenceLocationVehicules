package controleur;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import background.Client;
import background.Forfait;
import background.Location;
import background.PermisDeConduire;
import background.Vehicule;

public class creerLocation {
    private Location location;
    
    public creerLocation(Vehicule vehicule, Client client, Forfait forfait) throws Exception {
        
        //Creer location
        PermisDeConduire permiClient = client.getPermis();
        
        if( !this.validePermiConduire( vehicule, permiClient )) {
            throw new Exception("Permi de conduite invalide !");
        }
        
        
        this.location = new Location(client, new Date(),new Date(2021,12,4),forfait, vehicule);
        
        //Mettre la location dans la db
    }
    
    public boolean validePermiConduire(Vehicule vehicule, PermisDeConduire permi) {
        
        //Permi valide
        LocalDate ld = java.time.LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        
        Date todayDate = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
        boolean permiValide = permi.getDateExpiration().before( todayDate );
        boolean classeVehiculeValide = false;
        
        //Classe du permi
        String classe = permi.getClasse();
        if( vehicule.getClasse() == permi.getClasse()) {
            classeVehiculeValide = true;
        }
        
        return  permiValide && classeVehiculeValide;   
    }
    
    public void premierPaiement() {
        
    }
}
