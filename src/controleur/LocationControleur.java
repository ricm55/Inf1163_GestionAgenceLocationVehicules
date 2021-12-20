package controleur;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
    
    private ClientControleur controleurClient;
    
    public LocationControleur(ClientControleur controleur) throws Exception {
        
    	this.controleurClient = controleur;
    	
    	
        //Creer location
        
        
        //this.location = new Location(client, new Date(),new Date(2021,12,4),forfait, vehicule);
        
        //Mettre la location dans la db
    }
    

    /*public Vehicule rechercherInventaireLocationControleur(ClasseDeVehicule classe, LocalDate dateDebut, LocalDate dateFin, CatalogueVehicule catalogue)

    {	
    	//consulter inventaire et return le vehicule disponible ayant la classe correspondante
    	//Return null si vehicule 0 valide
    	for(Vehicule v : catalogue.getListeDeVehicule(classe)) {
    		if(v.getDisponible()) {
    			return v;
    		}
    	}
    	return null;

    }*/
    
    public boolean verificationValidePermisControleur(Client client,Vehicule vehicule)
    {
    	for (int classe = 0 ; classe <= client.getPermis().getClasses().size(); classe ++)
    	{
    		if (client.getPermis().getClasses().get(classe) == vehicule.getTypeDePermisNecessaire())
        	
        		return true;
    	}
    	
    	return false;
    }
    
    private double paiement(double paiement, double versement)
    {
    	double difference = 0.0;
    	if (versement > paiement)
    	{
    		difference = (paiement - versement) * -1;
    		
    	}
    	return difference;
    }
    
    
    //date expiration permis,classe valide,  age
    public double nouvelleLocationControleur(Vehicule vehicule, Client client, Forfait forfait, LocalDate dateDebut, LoaclDate dateFin)
    {	
    	this.verificationValidePermisControleur(client, vehicule);
    	Location location = new Location(client, dateDebut, dateFin, vehicule);
        this.controleurClient.setListeLocationEnPossession(location);
        return location.getPremierVersement();
    	
    }
    
    private double miseAJourKilometrageVehicule(Location location, double nouveauKilometrage)
    
    {
    	double surplus = 0;
    	if ( ( nouveauKilometrage > 500 ) && ( location.getForfait().getType() != "kilometrageIllimite"))
    	{
    		surplus = nouveauKilometrage - 500 * 0.21;
    		
    	}
    	else{
    		LocalDate now = LocalDate.now();
    		surplus = (int) ChronoUnit.DAYS.between(location.getDateDebut(), now) * 18.45;
    	}
    	
    	return surplus;
    	
    }
    
    public double miseAJourReservoirVehicule(double reservoir)
    {
    	return reservoir*1.41;
    }
    
    public double miseAJourDommages(double dommages)
    {
    	return dommages;
    }
    
    private double miseAJourVehicule(double niveauReservoir, double kilometrage, double dommages, Location location)
    {
    	double total = this.miseAJourDommages(dommages) + this.miseAJourReservoirVehicule(niveauReservoir);
    	total = total+this.miseAJourKilometrageVehicule(location, kilometrage);
    	total = total + (total * 0.14975);
    	return total;
    }
    
    private void retourVehicule(Location locationEnCours)
    {
    	for (int locations = 0; locations <= this.controleurClient.getListeLocationEnPossession().size(); locations ++)
    	{
    		Location location = this.controleurClient.getListeLocationEnPossession().get(locations);
    		
    		if(location == locationEnCours)
    		{	
    			this.controleurClient.enleverLocation(location);
    		}  	
    	}
    }
    
    private double miseAJourDelai(Location location)
    {
    	LocalDate now = LocalDate.now();
		int timeDiff = (int) ChronoUnit.HOURS.between(location.getDateDebut(), now);
		
		return timeDiff + (timeDiff*0.10);
		
    }
    
    private double totalDeuxiemeVersement(Location locationEnCours)
    {
    	
    	for (int locations = 0; locations <= this.controleurClient.getListeLocationEnPossession().size(); locations ++)
    	{
    		Location location = this.controleurClient.getListeLocationEnPossession().get(locations);
    		
    		if(location == locationEnCours)	
    		{	
    			return location.getDeuxiemeVersement();
    		}  	
    	}
    	return 0.0;
    	
    }

    
    private double paiementDeuxiemeVersement(double niveauReservoir,double kilometrage,Location location,double dommages)
    {
    	double total;
    	total = this.miseAJourVehicule(niveauReservoir, kilometrage, dommages, location);
    	total = total + totalDeuxiemeVersement(location);
    	total = total + this.miseAJourDelai(location);
    	
    	return total;
    	
    }
    
}       

