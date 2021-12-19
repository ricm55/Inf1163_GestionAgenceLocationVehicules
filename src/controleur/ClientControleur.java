package controleur;

import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.sqlite.util.StringUtils;

import background.ClasseDeVehicule;
import background.Client;
import background.Location;
import background.PermisDeConduire;
import background.Reservation;
import stockage.StockageClients;

public class ClientControleur
{
	private Client client;

	public ClientControleur(String telephone)
	{
		this.client = this.identifierClient(telephone);
	}

	// Si le client existe, return le client
	// Si le client n'existe pas, return null (devrait afficher un message d'erreur)
	public Client identifierClient(String telephone)
	{
		try
		{
			return StockageClients.getClient(telephone);
		} catch (SQLException | ParseException e)
		{
			JOptionPane.showMessageDialog(null, "Ce client n'existe pas.");
		}
		return null;
	}

	public boolean verificationExpirationPermisConduire()
	{
		// Permis valide
		LocalDate ld = java.time.LocalDate.now();
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date todayDate = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());

		boolean permisValideDate = client.getPermis().getDateExpiration().before(todayDate);

		if (permisValideDate == true)
		{
			return true;
		}
		return false;
	}

	public Client creerNouveauClient(String nom, String prenom, String telephone, String courriel, Date naissance, String adresse,
			boolean assurance, ArrayList<String> typesPermis, Date expiration)
	{
		LocalDate dateCreation = LocalDate.now();
		PermisDeConduire permis = new PermisDeConduire(expiration, typesPermis);
		Client client = new Client(nom, prenom, telephone, dateCreation, courriel, naissance, adresse, false);
		client.setPermis(permis);
		return client;
	}

	public boolean verificationAgeClient()
	{
		if (this.client.getAge() < 25)
		{
			return false;
		}
		return true;
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

	public Client getClient()
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

	public String getClassesPermisClient()
	{
		List<String> listeClasse = this.client.getPermis().getClasses();
		return StringUtils.join(listeClasse, ",");
	}

	public void setClassesPermisClient(String classes)
	{
		ArrayList<String> listeClasses = new ArrayList<String>();
		String[] arrayClasses = classes.split(",[ ]*");
		for (String s : arrayClasses)
		{
			listeClasses.add(s);
		}
		this.client.getPermis().setClasses(listeClasses);
	}

	public String getDateExpirationPermisClient()
	{
		return this.client.getPermis().getDateExpiration().toString();
	}

	public void setDateExpirationPermisClient(Date date)
	{
		this.client.getPermis().setDateExpiration(date);
	}

	public int getAge()
	{

		return this.client.getAge();
	}

}
