package controleur;

import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
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
	
	public Client creerNouveauClient(String nom, String prenom, String telephone, String courriel, String naissance, String adresse,
			boolean assurance, String typesPermis, String expiration)
	{
		LocalDate dateCreation = LocalDate.now();
		ArrayList<String> listeClasses = new ArrayList<String>();
		String[] arrayClasses = typesPermis.split(",[ ]*");
		for (String s : arrayClasses)
		{
			listeClasses.add(s);
		}
		LocalDate naissanceDate = parseDate(naissance);
		LocalDate expirationDate = parseDate(expiration);
		PermisDeConduire permis = new PermisDeConduire(expirationDate, listeClasses);
		System.out.println(naissance.toString());
		client = new Client(nom, prenom, telephone, dateCreation, courriel, naissanceDate, adresse, false, permis);
		client.setPermis(permis);
		return client;
	}

	// Si le client existe, return le client
	// Si le client n'existe pas, return null (devrait afficher un message d'erreur)
	public void identifierClient(String telephone)
	{
		try
		{
			this.client = StockageClients.getClient(telephone);
		} catch (SQLException | ParseException e)
		{
			JOptionPane.showMessageDialog(null, "Ce client n'existe pas.");
		}
	}
	
	private LocalDate parseDate(String date)
	{
		String[] tokens = date.split("-");
		return LocalDate.of(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
	}

	public boolean verificationExpirationPermisConduire()
	{
		// Permis valide
		LocalDate ld = LocalDate.now();

		if(ChronoUnit.MONTHS.between(ld, client.getPermis().getDateExpiration()) > 1)
		{
			return true;
		}
		return false;
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

	public void setDateDeNaissanceClient(String dateDeNaissance)
	{
		this.client.setDateDeNaissance(parseDate(dateDeNaissance));
	}

	public LocalDate getDateNaissanceClient()
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

	public void setDateExpirationPermisClient(String date)
	{
		this.client.getPermis().setDateExpiration(parseDate(date));
	}

	public int getAge()
	{

		return this.client.getAge();
	}

}
