package background;

import java.util.ArrayList;
import java.util.Date;

import constante.ClasseVehicule;

public class PermisDeConduire
{	
	private Date dateExpiration;
	private ArrayList<String> type;
	
	public PermisDeConduire(Date dateExpiration, ArrayList<String> type)
	{
		this.dateExpiration = dateExpiration;
		this.type = type;
	}
	
	public Date getDateExpiration()
	{
		return dateExpiration;
	}
	
	public void setDateExpiration(Date dateExpiration)
	{
		this.dateExpiration = dateExpiration;
	}
	
	public ArrayList<String> getClasse()
	{
		return type;
	}
	
	public void setClasse(ArrayList<String> type)
	{
		this.type = type;
	}

    @Override
    public String toString() {
        return "PermisDeConduire [getDateExpiration()=" + getDateExpiration() + ", getClasse()=" + getClasse() + "]";
    }
	
}
