package background;

import java.util.ArrayList;
import java.util.Date;

import constante.ClasseVehicule;

public class PermisDeConduire
{	
	private Date dateExpiration;
	private ArrayList<String> typesDePermis;
	
	public PermisDeConduire(Date dateExpiration, ArrayList<String> type)
	{
		this.dateExpiration = dateExpiration;
		this.typesDePermis = type;
	}
	
	public Date getDateExpiration()
	{
		return dateExpiration;
	}
	
	public void setDateExpiration(Date dateExpiration)
	{
		this.dateExpiration = dateExpiration;
	}
	
	public ArrayList<String> getClasses()
	{
		return typesDePermis;
	}
	
	public void setClasses(ArrayList<String> type)
	{
		this.typesDePermis = type;
	}

    @Override
    public String toString() {
        return "PermisDeConduire [getDateExpiration()=" + getDateExpiration() + ", getClasses()=" + getClasses() + "]";
    }
	
}
