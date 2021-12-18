package controleur;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
    
    private ClientControleur client;
    
    public LocationControleur(String telephone) throws Exception {
        
    	this.client = new ClientControleur(telephone);
    	
    	
        //Creer location
        
        
        //this.location = new Location(client, new Date(),new Date(2021,12,4),forfait, vehicule);
        
        //Mettre la location dans la db
    }
    
    public boolean VerificationExpirationPermisConduire(Client client) {
        
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
    
    public boolean verificationValidePermisControleur(Client client,Vehicule vehicule)
    {
    	for (int classe = 0 ; classe <= client.getPermis().getClasse().size(); classe ++)
    	{
    		if (client.getPermis().getClasse().get(classe) == vehicule.getTypeDePermisNecessaire())
        	
        		return true;
    	}
    	
    	return false;
    }
    
    public boolean verificationAgeClient(Client client)
    {
    	if (this.client.getAge()  < 25)
    	{
    		return false;
    	}
    	return true;
    }
    
    public boolean verificationGeneraleClient(Client client, Vehicule vehicule)
    {
    	if (this.verificationValidePermisControleur(client, vehicule) && this.VerificationExpirationPermisConduire(client) && this.verificationAgeClient(client))
    	{
    		return true;
    	}
    	return false;
    	
    }
    
    private double paiementPremierVersement(double paiement, double versement)
    {
    	double difference = 0.0;
    	if (versement > paiement)
    	{
    		difference = (paiement - versement) * -1;
    		
    	}
    	return difference;
    }
    
    
    //date expiration permis,classe valide,  age
    public double nouvelleLocationControleur(Vehicule vehicule, Client client, Forfait forfait, Date dateDebut, Date dateFin)
    {	
    	this.verificationGeneraleClient(client, vehicule);
    	Location location = new Location(client, dateDebut, dateFin, forfait, vehicule);
        this.client.setListeLocationEnPossession(location);
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
    	
    		long dateLocation = location.getDateDebut().getTime();
    	
    		Date dateNow=new Date();  
    	
    		long timeDiff = dateLocation - dateNow.getTime();
    	
    		surplus = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MICROSECONDS) * 18.45 ;
    	}
    	
    	return surplus;
    	
    }
    
    private double miseAJourReservoirVehicule(double reservoir)
    {
    	return reservoir*1.41;
    }
    
    private double miseAJourDommages(double dommages)
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
    	for (int locations = 0; locations <= this.client.getListeLocationEnPossession().size(); locations ++)
    	{
    		Location location = this.client.getListeLocationEnPossession().get(locations);
    		
    		if(location == locationEnCours)
    		{	
    			this.client.enleverLocation(location);
    		}  	
    	}
    }
       
}