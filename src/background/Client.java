package background;

import java.util.Date;

public class Client
{
	private String nom;
	private Date dateDeNaissance;
	private String adresse;
	private String numTelephone;
	private boolean assurancePersonnelle;
	private PermisDeConduire permis;
	
	public Client(String nom, Date dateDeNaissance, String adresse, String numTelephone, boolean assurancePersonnelle,
			PermisDeConduire permis)
	{
		this.nom = nom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numTelephone = numTelephone;
		this.assurancePersonnelle = assurancePersonnelle;
		this.permis = permis;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public Date getDateDeNaissance()
	{
		return dateDeNaissance;
	}
	
	public void setDateDeNaissance(Date dateDeNaissance)
	{
		this.dateDeNaissance = dateDeNaissance;
	}
	
	public String getAdresse()
	{
		return adresse;
	}
	
	public void setAdresse(String adresse)
	{
		this.adresse = adresse;
	}
	
	public String getNumTelephone()
	{
		return numTelephone;
	}
	
	public void setNumTelephone(String numTelephone)
	{
		this.numTelephone = numTelephone;
	}
	
	public boolean isAssurancePersonnelle()
	{
		return assurancePersonnelle;
	}
	
	public void setAssurancePersonnelle(boolean assurancePersonnelle)
	{
		this.assurancePersonnelle = assurancePersonnelle;
	}
	
	public PermisDeConduire getPermis()
	{
		return permis;
	}
	
	public void setPermis(PermisDeConduire permis)
	{
		this.permis = permis;
	}
}
