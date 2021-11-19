package background;

import java.util.Date;

public class Location
{
	private Date debut;
	private Date fin;
	private int duree;
	private int kilometrageInitial;
	
	public Location(Date debut, Date fin, int duree, int kilometrageInitial)
	{
		this.debut = debut;
		this.fin = fin;
		this.duree = duree;
		this.kilometrageInitial = kilometrageInitial;
	}
	
	public Date getDebut()
	{
		return debut;
	}
	
	public void setDebut(Date debut)
	{
		this.debut = debut;
	}
	
	public Date getFin()
	{
		return fin;
	}
	
	public void setFin(Date fin)
	{
		this.fin = fin;
	}
	
	public int getDuree()
	{
		return duree;
	}
	
	public void setDuree(int duree)
	{
		this.duree = duree;
	}
	
	public int getKilometrageInitial()
	{
		return kilometrageInitial;
	}
	
	public void setKilometrageInitial(int kilometrageInitial)
	{
		this.kilometrageInitial = kilometrageInitial;
	}
}
