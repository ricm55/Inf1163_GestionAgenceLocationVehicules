package background;

import java.util.Date;

public class Location
{
	private Date dateDebut;
	private Date dateFin;
	private int duree;
	private Vehicule vehicule;
	private Forfait forfait;
	private int kilometrageInitial;

	
	public Location(Date dateDebut, Date dateFin, int duree, Vehicule vehicule, Forfait forfait)
	{
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.duree = duree;
		this.vehicule = vehicule;
		this.forfait = forfait;
		this.kilometrageInitial = this.vehicule.getKilometrage();
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
	
	public int getDuree()
	{
		return this.duree;
	}
	
	public void setDuree(int duree)
	{
		this.duree = duree;
	}
	
	public int getKilometrageInitial()
	{
		return this.kilometrageInitial;
	}
	
	
}
