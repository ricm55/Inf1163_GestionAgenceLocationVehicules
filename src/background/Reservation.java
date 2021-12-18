package background;

import java.util.Date;

public class Reservation
{
	private Date debut;
	private Date fin;
	
	
	public Reservation(Date debut, Date fin)
	{
		this.debut = debut;
		this.fin = fin;
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
}
