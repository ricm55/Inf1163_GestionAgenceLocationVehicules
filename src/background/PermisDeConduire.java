package background;

import java.util.Date;

import constante.ClasseVehicule;

public class PermisDeConduire
{	
	private Date dateExpiration;
	private ClasseVehicule classe;
	
	public PermisDeConduire(Date dateExpiration, ClasseVehicule classe)
	{
		this.dateExpiration = dateExpiration;
		this.classe = classe;
	}
	
	public Date getDateExpiration()
	{
		return dateExpiration;
	}
	
	public void setDateExpiration(Date dateExpiration)
	{
		this.dateExpiration = dateExpiration;
	}
	
	public ClasseVehicule getClasse()
	{
		return classe;
	}
	
	public void setClasse(ClasseVehicule classe)
	{
		this.classe = classe;
	}

    @Override
    public String toString() {
        return "PermisDeConduire [getDateExpiration()=" + getDateExpiration() + ", getClasse()=" + getClasse() + "]";
    }
	
}
