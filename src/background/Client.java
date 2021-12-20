package background;

import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import errorHandler.CustomException;
import stockage.StockageClients;

public class Client
{
	private int id = -1;
	private String nom;
	private String prenom;
	private String numTelephone;
	private LocalDate dateCreation;
	private String courriel;
	private LocalDate dateDeNaissance;
	private String adresse;
	private boolean assurancePersonnelle;
	private PermisDeConduire permis;
	private List<Reservation> listeReservationEnPossession;
	private List<Location> listeLocationEnPossession;
	private int age;

	public Client(String nom, String prenom, String numTelephone, LocalDate dateCreation, String courriel,
			LocalDate dateDeNaissance, String adresse, boolean assurancePersonnelle, PermisDeConduire permis)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numTelephone = numTelephone;
		this.dateCreation = dateCreation;
		this.courriel = courriel;
		this.assurancePersonnelle = assurancePersonnelle;
		this.permis = permis;
		List<Reservation> listeReservationEnPossession = new ArrayList<Reservation>();
		List<Location> listeLocationEnPossession = new ArrayList<Location>();
		this.age = this.calculAge();
		try
		{
			StockageClients.insertClient(this);
		} catch (SQLException | ParseException | CustomException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Client(int id, String nom, String prenom, String numTelephone, LocalDate dateCreation, String courriel,
			LocalDate dateDeNaissance, String adresse, boolean assurancePersonnelle)
	{
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numTelephone = numTelephone;
		this.dateCreation = dateCreation;
		this.courriel = courriel;
		this.assurancePersonnelle = assurancePersonnelle;
		// maybe instancier ca? you know parce que les listes sont pas vides quand on get le client
		List<Reservation> listeReservationEnPossession = new ArrayList<Reservation>();
		List<Location> listeLocationEnPossession = new ArrayList<Location>();
		this.age = this.calculAge();
	}

	public String getNom()
	{
		return nom;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return this.age;
	}

	// besoins de calculer age
	public int calculAge()
	{
		LocalDate ld = LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(dateDeNaissance, ld));
		return (int) ChronoUnit.YEARS.between(dateDeNaissance, ld);
	}

	public boolean enleverLocation(Location location)
	{
		return this.listeLocationEnPossession.remove(location);
	}

	public List<Location> getListeLocationEnPossession()
	{
		return this.listeLocationEnPossession;
	}

	public void setListeLocationEnPossession(Location location)
	{
		this.listeLocationEnPossession.add(location);
	}

	public boolean enleverReservation(Reservation reservation)
	{
		return this.listeReservationEnPossession.remove(reservation);
	}

	public List<Reservation> getListeReservationEnPossession()
	{
		return this.listeReservationEnPossession;
	}

	public void setListeReservationEnPossession(Reservation reservation)
	{
		this.listeReservationEnPossession.add(reservation);
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public LocalDate getDateDeNaissance()
	{
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance)
	{
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse()
	{
		return adresse;
	}

	public void setAdresse(String adresse)
	{
		this.adresse = adresse;
	}

	public String getNumTelephone()
	{
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone)
	{
		this.numTelephone = numTelephone;
	}

	public boolean isAssurancePersonnelle()
	{
		return assurancePersonnelle;
	}

	public void setAssurancePersonnelle(boolean assurancePersonnelle)
	{
		this.assurancePersonnelle = assurancePersonnelle;
	}

	public PermisDeConduire getPermis()
	{
		return permis;
	}

	public void setPermis(PermisDeConduire permis)
	{
		this.permis = permis;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom()
	{
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * @return the dateCreation
	 */
	public LocalDate getDateCreation()
	{
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(LocalDate dateCreation)
	{
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the courriel
	 */
	public String getCourriel()
	{
		return courriel;
	}

	/**
	 * @param courriel the courriel to set
	 */
	public void setCourriel(String courriel)
	{
		this.courriel = courriel;
	}

	@Override
	public String toString()
	{
		return "Client [getNom()=" + getNom() + ", getDateDeNaissance()=" + getDateDeNaissance() + ", getAdresse()="
				+ getAdresse() + ", getNumTelephone()=" + getNumTelephone() + ", isAssurancePersonnelle()="
				+ isAssurancePersonnelle() + ", getPermis()=" + getPermis() + "]";
	}
}
