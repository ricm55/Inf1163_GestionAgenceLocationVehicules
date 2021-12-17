package background;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Client
{
    private int id;
	private String nom;
	private String prenom;
	private String numTelephone;
	private LocalDate dateCreation;
	private String courriel;
    private Date dateDeNaissance;
	private String adresse;
	private boolean assurancePersonnelle;
	private PermisDeConduire permis;
	private List<Reservation> listeReservationEnPossession;


	public Client(int id, String nom, String prenom, String numTelephone, LocalDate dateCreation,String courriel,Date dateDeNaissance, String adresse, boolean assurancePersonnelle)
	{
	    this.setId( id );
		this.setNom( nom );
		this.setPrenom( prenom );
		this.setDateDeNaissance( dateDeNaissance );
		this.setAdresse(adresse);
		this.setNumTelephone( numTelephone);
		this.setDateCreation( dateCreation );
		this.setCourriel( courriel );
		this.setAssurancePersonnelle(assurancePersonnelle);
		List<Reservation> listeReservationEnPossession = new ArrayList<Reservation>();
		List <Location> listeLocationEnPossession = new ArrayList<Location>();
	}
	
	public String getNom()
	{
		return nom;
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
	
	public Date getDateDeNaissance()
	{
		return dateDeNaissance;
	}
	
	public void setDateDeNaissance(Date dateDeNaissance)
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
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId( int id ) {
        this.id = id;
    }

    /**
     * @return the dateCreation
     */
    public LocalDate getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation( LocalDate dateCreation ) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the courriel
     */
    public String getCourriel() {
        return courriel;
    }

    /**
     * @param courriel the courriel to set
     */
    public void setCourriel( String courriel ) {
        this.courriel = courriel;
    }

    @Override
    public String toString() {
        return "Client [getNom()=" + getNom() + ", getDateDeNaissance()=" + getDateDeNaissance() + ", getAdresse()="
                + getAdresse() + ", getNumTelephone()=" + getNumTelephone() + ", isAssurancePersonnelle()="
                + isAssurancePersonnelle() + ", getPermis()=" + getPermis() + "]";
    }
}
