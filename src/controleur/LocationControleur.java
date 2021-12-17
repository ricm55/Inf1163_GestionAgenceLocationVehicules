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
        
        
        //this.location = new Location(client, new Date(),new Date(2021,12,4),forfait, vehicule);
        
        //Mettre la location dans la db
    }
    
    public boolean VerificationValidePermisConduire(Client client) {
        
        //Permi valide
        LocalDate ld = java.time.LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Date todayDate = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
        
        boolean permiValideDate = client.getPermis().getDateExpiration().before( todayDate );
        
        if (permiValideDate == true) 
        {
        	return true;
        }
        return false;
        
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
    
    public boolean verificationExpirationPermisControleur(Client client,Vehicule vehicule)
    {
    	for (int classe = 0 ; classe <= client.getPermis().getClasse().size(); classe ++)
    	{
    		if (client.getPermis().getClasse().get(classe) == vehicule.getTypeDePermisNecessaire())
        	
        		return true;
    	}
    	
    	return false;
    }
    
    
   
    
    //date expiration permis,classe valide,  age
    public double nouvelleLocationControleur(Vehicule vehicule, Client client, Forfait forfait, Date dateDebut, Date dateFin)
    {	
    	if (this.verificationExpirationPermisControleur(client, vehicule) && this.VerificationValidePermisConduire(client)) {
    		Location location = new Location(client, dateDebut, dateFin, forfait, vehicule);
        	this.client.setListeLocationEnPossession(location);
        	
        	return location.getPremierVersement();
    	}
    	return 0.0;
    	
    }
}
