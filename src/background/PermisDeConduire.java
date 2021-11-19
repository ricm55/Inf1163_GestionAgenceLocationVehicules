package background;

import java.util.Date;

public class PermisDeConduire
{	
	private Date dateExpiration;
	private String classe;
	
	public PermisDeConduire(Date dateExpiration, String classe)
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
	
	public String getClasse()
	{
		return classe;
	}
	
	public void setClasse(String classe)
	{
		this.classe = classe;
	}
}
