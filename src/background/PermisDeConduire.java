package background;

import java.time.LocalDate;
import java.util.ArrayList;

import constante.ClasseVehicule;

public class PermisDeConduire
{	
	private LocalDate dateExpiration;
	private ArrayList<String> typesDePermis;
	
	public PermisDeConduire(LocalDate expiration, ArrayList<String> type)
	{
		this.dateExpiration = expiration;
		this.typesDePermis = type;
	}
	
	public LocalDate getDateExpiration()
	{
		return dateExpiration;
	}
	
	public void setDateExpiration(LocalDate dateExpiration)
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
