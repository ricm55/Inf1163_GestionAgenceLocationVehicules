package background;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Location
{
	private Date dateDebut;
	private Date dateFin;
	private int duree;
	private Vehicule vehicule;
	private Forfait forfait;
	private int kilometrageInitial;
	private boolean estEnCours;
	
	public Location(Date dateDebut, Date dateFin, Vehicule vehicule, Forfait forfait)
	{
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.duree = 0;
		this.vehicule = vehicule;
		this.forfait = forfait;
		this.kilometrageInitial = this.vehicule.getKilometrage();
		this.estEnCours = false;
	
	}
	
	public int getDuree() 
	{
		return this.duree;
	}
	
	public void setDuree() 
	{
		this.duree = ChronoUnit.DAYS.between(this.dateDebut, this.dateFin);
	}
	
	public int getKilometrageParcouru(Vehicule vehicule) 
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
	
	public Date getDebut()
	{
		return this.dateDebut;
	}
	
	public void setDebut(Date debut)
	{
		this.dateDebut = debut;
	}
	
	public Date getFin()
	{
		return this.dateFin;
	}
	
	public void setFin(Date fin)
	{
		this.dateFin = fin;
	}
	
	
	public int getKilometrageInitial()
	{
		return this.kilometrageInitial;
	}
	
	
}
