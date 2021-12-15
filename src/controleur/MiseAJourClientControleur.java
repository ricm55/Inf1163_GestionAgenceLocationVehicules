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
	
	public void modifierDateDeNaissance(Date dateDeNaissance)
	{
		this.client.setDateDeNaissance(dateDeNaissance);
	}
	
	public void modifierAdresse(String adresse)
	{
		this.client.setAdresse(adresse);
	}
	
	public void modifierNumTelephone(String numTelephone)
	{
		this.client.setNumTelephone(numTelephone);
	}
	
	public void modifierAssurancePersonnelle(boolean assurancePersonnelle) 
	{
		this.client.setAssurancePersonnelle(assurancePersonnelle);
	}
	
	public void modifierPermis(PermisDeConduire permis)
	{
		this.client.setPermis(permis);
	}
	
	

}
