package controleur;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import background.CatalogueVehicule;
import background.ClasseDeVehicule;
import background.Client;
import background.Forfait;
import background.Location;
import background.Paiement;
import background.PermisDeConduire;
import background.Vehicule;
import constante.ClasseVehicule;

public class LocationControleur {
    private Location location;
    private ClientControleur client;
    
    public LocationControleur(String telephone) throws Exception {
        
    	this.client = new ClientControleur(telephone);
    	
    	
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
        System.out.println( todayDate );
        boolean permiValideDate = permi.getDateExpiration().before( todayDate );
        boolean classeVehiculeValide = false;
        
        //Classe du permi
        ClasseVehicule classe = permi.getClasse();
        if( vehicule.getClasseDeVehicule() == permi.getClasse()) {
            classeVehiculeValide = true;
        }
        System.out.println(classeVehiculeValide);
        System.out.println(permiValideDate);
        
        return  permiValideDate && classeVehiculeValide;   
    }
    
    public void premierPaiement() {
        
    }
    
    
    public Vehicule rechercherInventaireLocationControleur(ClasseDeVehicule classe, Date dateDebut, Date dateFin, CatalogueVehicule catalogue)
    {	
    	//consulter inventaire et return le vehicule disponible ayant la classe correspondante
    	//Return null si vehicule 0 valide
    	for (int vehicules = 0; vehicules <= catalogue.getListeDeVehicule().size(); vehicules ++)
    	{
    		Vehicule vehicule = catalogue.getListeDeVehicule().get(vehicules);
    		if(vehicule.getDisponible())
    		{
    			if (vehicule.getClasseDeVehicule() == classe);
    			{
    				return vehicule;
    			}	
    		}  		
    	}
    	return null;

    }
    
    public Paiement nouvelleLocationControleur(Vehicule vehicule, Client client, Forfait forfait, Date dateDebut, Date dateFin)
    {	
    	Location location = new Location(client, dateDebut, dateFin, forfait, vehicule);
    	this.client.setListeLocationEnPossessionClientControleur(location);
    	
    	return location.getPremierVersement();
    
    }
}
