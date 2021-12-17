package controleur;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import background.Client;
import background.Location;
import background.PermisDeConduire;
import background.Reservation;

public class ClientControleur  {

	private Client client;
	
	public ClientControleur(String telephone) {
		this.client = this.identifierClient(telephone);
		
	}
	
	public boolean rechercheClient(String telephone)
	{
		//if client exist
		return true;
		//else
			//return false;
	}
	//Si le client existe, return le client
	//Si le client n'existe pas, return null (devrait afficher un message d'erreur)
	public Client identifierClient(String telephone)
	{
		if (this.rechercheClient(telephone) == true)
		{
			return client;
		}
		else
		{
			return null;
		}
		
	}
	
	public List<Reservation> getListeReservationEnPossessionClientControleur()
	{
		return this.client.getListeReservationEnPossession();
	}
	
	public void setListeReservationEnPossessionClientControleur(Reservation reservation)
	{
		this.client.setListeReservationEnPossession(reservation);
	}
	
	public boolean enleverReservationClientControleur(Reservation reservation)
	{
		return this.client.enleverReservation(reservation);
		
	}
	
	public Client getClientControleur()
	{
		return this.client;
	}
	
	public void setPrenomClient(String prenom)
	{
		this.client.setPrenom(prenom);
			
	}
	
	public String getPrenomClient()
	{
		return this.client.getPrenom();
	}
	
	public void setCourrielClient(String courriel)
	{
		this.client.setCourriel(courriel);
	}
	
	public LocalDate getDateCreationClient()
	{
		return this.client.getDateCreation();
	}
	
	public void setDateCreationClient(LocalDate date)
	{
		this.client.setDateCreation(date);
	}
	
	public int getIdClient()
	{
		return this.client.getId();
	}
	
	public void setIdClient(int id)
	{
		this.client.setId(id);
	}
	
	public String getCourrielClient()
	{
		return this.client.getCourriel();
	}
		
	public void setNomClient(String nom)
	{
		this.client.setNom(nom);
	}
	
	public String getNomClient()
	{
		return this.client.getNom();
	}
	
	public void setDateDeNaissanceClient(Date dateDeNaissance)
	{
		this.client.setDateDeNaissance(dateDeNaissance);
	}
	
	public java.util.Date getDateNaissanceClient()
	{
		return this.client.getDateDeNaissance();
	}
	
	public void setAdresseClient(String adresse)
	{
		this.client.setAdresse(adresse);
	}
	
	public String getAdresseClient()
	{
		return this.client.getAdresse();
	}
	
	public void setNumTelephoneClient(String numTelephone)
	{
		this.client.setNumTelephone(numTelephone);
	}
	
	public String getNumTelephoneClient()
	{
		return this.client.getNumTelephone();
	}
	
	public void setAssurancePersonnelleClient(boolean assurancePersonnelle) 
	{
		this.client.setAssurancePersonnelle(assurancePersonnelle);
	}
	
	public boolean isAssurancePersonnelleClient()
	{
		return this.client.isAssurancePersonnelle();
	}
	
	public void setPermisClient(PermisDeConduire permis)
	{
		this.client.setPermis(permis);
	}
	
	public PermisDeConduire getPermisClient()
	{
		return this.client.getPermis();
	}
	
	

}
