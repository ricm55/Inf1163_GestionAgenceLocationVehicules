package controleur;

import java.sql.Date;

import background.Client;
import background.PermisDeConduire;

public class MiseAJourClientControleur {

	private Client client;
	
	public MiseAJourClientControleur(String nom, String telephone) {
		
		Client client = this.identifierClient(nom, telephone);
	}
	
	
	public Client identifierClient(String Nom, String telephone)
	{
		//Recherche d'un client
		return null;
	}
		
	public void modifierNomClient(String nom)
	{
		this.client.setNom(nom);
	}
	
	public String getNomClient()
	{
		return this.client.getNom();
	}
	
	public void modifierDateDeNaissanceClient(Date dateDeNaissance)
	{
		this.client.setDateDeNaissance(dateDeNaissance);
	}
	
	public java.util.Date getDateNaissanceClient()
	{
		return this.client.getDateDeNaissance();
	}
	
	public void modifierAdresseClient(String adresse)
	{
		this.client.setAdresse(adresse);
	}
	
	public String getAdresseClient()
	{
		return this.client.getAdresse();
	}
	
	public void modifierNumTelephoneClient(String numTelephone)
	{
		this.client.setNumTelephone(numTelephone);
	}
	
	public String getNumTelephoneClient()
	{
		return this.client.getNumTelephone();
	}
	
	public void modifierAssurancePersonnelleClient(boolean assurancePersonnelle) 
	{
		this.client.setAssurancePersonnelle(assurancePersonnelle);
	}
	
	public boolean isAssurancePersonnelleClient()
	{
		return this.client.isAssurancePersonnelle();
	}
	
	public void modifierPermisClient(PermisDeConduire permis)
	{
		this.client.setPermis(permis);
	}
	
	public PermisDeConduire getPermisClient()
	{
		return this.client.getPermis();
	}
	
	

}
