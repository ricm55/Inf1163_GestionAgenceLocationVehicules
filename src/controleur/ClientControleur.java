package controleur;


import java.sql.SQLException;
import java.text.ParseException;

import java.util.Date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import org.sqlite.util.StringUtils;

import background.Client;
import background.Location;
import background.PermisDeConduire;
import background.Reservation;

import stockage.StockageClients;

import background.Vehicule;


public class ClientControleur
{
	private Client client;

	public ClientControleur(String telephone) throws SQLException, ParseException
	{
		this.client = this.identifierClient(telephone);
	}

	public boolean rechercheClient(String telephone) throws SQLException, ParseException
	{
		// if client exist
		if(StockageClients.getClient(telephone) != null) {
			return true;
		}
		
		// else
		return false;
	}

	// Si le client existe, return le client
	// Si le client n'existe pas, return null (devrait afficher un message d'erreur)
	public Client identifierClient(String telephone) throws SQLException, ParseException
	{
		if (this.rechercheClient(telephone) == true)
		{

			return StockageClients.getClient(telephone);
			
		} else

		{
			return null;
		}

	}

	private boolean verificationExpirationPermisConduire(Client client)
	{
		// Permi valide
		LocalDate ld = java.time.LocalDate.now();
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date todayDate = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());

		boolean permiValideDate = client.getPermis().getDateExpiration().before(todayDate);

		if (permiValideDate == true)
		{
			return true;
		}
		return false;

	}

	private boolean verificationAgeClient(Client client)
	{
		if (this.client.getAge() < 25)
		{
			return false;
		}
		return true;
	}
	
	public boolean verificationGeneraleClient(Client client, Vehicule vehicule)
    {
    	return verificationExpirationPermisConduire(client) && verificationAgeClient(client);
    }

	public List<Location> getListeLocationEnPossession()
	{
		return this.client.getListeLocationEnPossession();
	}

	public void setListeLocationEnPossession(Location location)
	{
		this.client.setListeLocationEnPossession(location);
	}

	public boolean enleverLocation(Location location)
	{
		return this.client.enleverLocation(location);

	}

	public List<Reservation> getListeReservationEnPossession()
	{
		return this.client.getListeReservationEnPossession();
	}

	public void setListeReservationEnPossession(Reservation reservation)
	{
		this.client.setListeReservationEnPossession(reservation);
	}

	public boolean enleverReservation(Reservation reservation)
	{
		return this.client.enleverReservation(reservation);

	}

	public Client getClient() throws SQLException, ParseException
	{
		return StockageClients.getClient(getNumTelephoneClient());
	}

	public void setPrenomClient(String prenom)
	{
		this.client.setPrenom(prenom);

	}

	public String getPrenomClient() throws SQLException, ParseException
	{
		return StockageClients.getClient(getNumTelephoneClient()).toString();
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

	public String getNomClient() throws SQLException, ParseException
	{
		return StockageClients.getClient(getNumTelephoneClient()).toString();
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

	public String getNumTelephoneClient() throws SQLException, ParseException
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

	public String getClassesPermisClient()
	{
		List<String> listeClasse = this.client.getPermis().getClasses();
		return StringUtils.join(listeClasse, ",");
	}

	public String getDateExpirationPermisClient()
	{
		return this.client.getPermis().getDateExpiration().toString();
	}

	public int getAge()
	{

		return this.client.getAge();
	}

}
