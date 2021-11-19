package background;

public class Vehicule
{
	private String marque;
	private String modele;
	private int annee;
	private String couleur;
	private int kilometrage;
	private double niveauReservoir;
	
	public Vehicule(String marque, String modele, int annee, String couleur, int kilometrage, double niveauReservoir)
	{
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.couleur = couleur;
		this.kilometrage = kilometrage;
		this.niveauReservoir = niveauReservoir;
	}
	
	public String getMarque()
	{
		return marque;
	}
	
	public void setMarque(String marque)
	{
		this.marque = marque;
	}
	
	public String getModele()
	{
		return modele;
	}
	
	public void setModele(String modele)
	{
		this.modele = modele;
	}
	
	public int getAnnee()
	{
		return annee;
	}
	
	public void setAnnee(int annee)
	{
		this.annee = annee;
	}
	
	public String getCouleur()
	{
		return couleur;
	}
	
	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}
	
	public int getKilometrage()
	{
		return kilometrage;
	}
	
	public void setKilometrage(int kilometrage)
	{
		this.kilometrage = kilometrage;
	}
	
	public double getNiveauReservoir()
	{
		return niveauReservoir;
	}
	
	public void setNiveauReservoir(double niveauReservoir)
	{
		this.niveauReservoir = niveauReservoir;
	}
}
