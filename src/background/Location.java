package background;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Location
{
    private Client client;
	private Date dateDebut;
	private Date dateFin;
	private int duree;
	private Vehicule vehicule;
	private Forfait forfait;
	private int kilometrageInitial;
	private boolean estEnCours;
	private double premierVersement;
	private double deuxiemeVersement;
	
	public Location(Client client, Date dateDebut, Date dateFin, Forfait forfait, Vehicule vehicule)
	{
	    this.setClient( client );
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.duree = 0;
		this.vehicule = vehicule;
		this.forfait = forfait;
		this.kilometrageInitial = this.vehicule.getKilometrage();
		this.estEnCours = true;
		this.premierVersement = definitionPremierVersement(vehicule);
		this.deuxiemeVersement = deuxiemeVersement;
	
	}
	
	public Paiement setPremierVersement(int premierVersement ) 
	{
		return premierVersement;

	}
	
	public void setDeuxiemeVersement(double deuxiemeVersement)
	{

		this.deuxiemeVersement.setMontant(deuxiemeVersement);

	}
	
	public void definitionPremierVersement(Vehicule vehicule)
	{
		switch (vehicule.getClasseDeVehicule().getClasse())
		{
		
		case ECONOMIQUE:
			this.setPremierVersement(61);
			break;
		case MOYENNE:
			this.setPremierVersement(72);
			break;
		case CONFORT:
			this.setPremierVersement(83);
			break;
		case LUXE:
			this.setPremierVersement(114);
			break;
		case UTILITAIRE:
			this.setPremierVersement(99);
			break;
		default:
			break;
		}
	}
	
	public Paiement getPremierVersement()
	{
		return this.premierVersement;
	}
	
	public Paiement getDeuxiemeVersement()
	{
		return this.deuxiemeVersement;
	}

	public int getDuree() 
	{
		return this.duree;
	}
	
	public void setDuree() 
	{
		//this.duree = ChronoUnit.DAYS.between(this.dateDebut, this.dateFin);
	}
	
	public int getKilometrageParcouru() 
	{
		return this.vehicule.getKilometrage() - this.kilometrageInitial ;
	}
	
	public boolean getEstEnCours() 
	{
		return this.estEnCours;
	}
	
	public void setEstEnCours(boolean estEnCours) 
	{
		this.estEnCours = estEnCours;
	}
	
	public void setForfait(Forfait forfait)
	{
		this.forfait = forfait;
	}
	
	public Forfait getForfait() 
	{
		return this.forfait;
	}
	
	public Date getDateDebut()
	{
		return this.dateDebut;
	}
	
	public void setDateDebut(Date debut)
	{
		this.dateDebut = debut;
	}
	
	public Date getDateFin()
	{
		return this.dateFin;
	}
	
	public void setDateFin(Date fin)
	{
		this.dateFin = fin;
	}
	
	
	public int getKilometrageInitial()
	{
		return this.kilometrageInitial;
	}

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient( Client client ) {
        this.client = client;
    }
    
    public Vehicule getVehicule() {
        return this.vehicule;
    }

    @Override
    public String toString() {
        return "Location [getDuree()=" + getDuree() + "\n, getKilometrageParcouru()=" + getKilometrageParcouru()
                + "\n, getEstEnCours()=" + getEstEnCours() + "\n, getForfait()=" + getForfait() + "\n, getDateDebut()="
                + getDateDebut() + "\n, getDateFin()=" + getDateFin() + "\n, getKilometrageInitial()="
                + getKilometrageInitial() + "\n, getClient()=" + getClient() + "\n, getVehicule()=" + getVehicule() + "]";
    }
    
    
	
}
