package background;

import java.time.LocalDate;
import java.util.ArrayList;

public class Location
{
    private Client client;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private int duree;
	private Vehicule vehicule;
	private Forfait forfait;
	private double kilometrageInitial;
	private boolean estEnCours;
	private double premierVersement;
	private double deuxiemeVersement;
	private ArrayList<String> tarifApplicable;
	
	//SEULEMENT POUR LE STOCKAGE
	public Location(Client client, LocalDate dateDebut, LocalDate dateFin, Vehicule vehicule)
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
	
	//UTILISER LUI POUR L'APP
	public Location(Client client, LocalDate dateDebut, LocalDate dateFin, Vehicule vehicule,ArrayList<String> tarifApplicable)
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
        this.tarifApplicable = tarifApplicable;
    
    }
	
	public double setPremierVersement(double premierVersement ) 
	{
		return premierVersement;

	}
	
	public double setDeuxiemeVersement(double deuxiemeVersement)
	{

		return deuxiemeVersement;

	}
	
	public double definitionPremierVersement(Vehicule vehicule)
	{
		/*switch (vehicule.getClasseDeVehicule().getClasse())
		{
		
		case ECONOMIQUE:
			return this.setPremierVersement(61.0);
			
		case MOYENNE:
			return this.setPremierVersement(72.0);
			
		case CONFORT:
			return this.setPremierVersement(83.0);
			
		case LUXE:
			return this.setPremierVersement(114.0);
			
		case UTILITAIRE:
			return this.setPremierVersement(99.0);
			
		default:
			break;
		}*/
		return 0;
		
	}
	
	public double getPremierVersement()
	{
		return this.premierVersement;
	}
	
	public double getDeuxiemeVersement()
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
	
	public double getKilometrageParcouru() 
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
	
	public LocalDate getDateDebut()
	{
		return this.dateDebut;
	}
	
	public void setDateDebut(LocalDate debut)
	{
		this.dateDebut = debut;
	}
	
	public LocalDate getDateFin()
	{
		return this.dateFin;
	}
	
	public void setDateFin(LocalDate fin)
	{
		this.dateFin = fin;
	}
	
	
	public double getKilometrageInitial()
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

    /**
     * @return the tarifApplicable
     */
    public ArrayList<String> getTarifApplicable() {
        return tarifApplicable;
    }

    /**
     * @param tarifApplicable the tarifApplicable to set
     */
    public void setTarifApplicable( ArrayList<String> tarifApplicable ) {
        this.tarifApplicable = tarifApplicable;
    }
    
    
	
}
