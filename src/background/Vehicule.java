package background;

public class Vehicule
{
	private String marque;
	private String modele;
	private int annee;
	private String couleur;
	private double kilometrage;
	private double niveauReservoir;
	private boolean disponible;
	private String classe;
	private String typeDePermisNecessaire;
	
	public Vehicule(String typeDePermisNecessaire,String marque, String modele, int annee, String couleur, double kilometrage, double niveauReservoir, boolean disponible, String classe)
	{
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.couleur = couleur;
		this.kilometrage = kilometrage;
		this.niveauReservoir = niveauReservoir;
		this.disponible = disponible;
		this.setClasse( classe );
		this.typeDePermisNecessaire = typeDePermisNecessaire;
	}
	
	public Vehicule(String marque, String modele, int annee) {
	    this.marque = marque;
        this.modele = modele;
        this.annee = annee;
	}
	
	@Override
    public String toString() {
        return "Vehicule [getMarque()=" + getMarque() + ", getModele()=" + getModele() + ", getAnnee()=" + getAnnee()
                + ", getCouleur()=" + getCouleur() + ", getKilometrage()=" + getKilometrage()
                + ", getNiveauReservoir()=" + getNiveauReservoir() + "]";
    }
	
    public String getMarque()
	{
		return marque;
	}
    
    public void setDisponible(boolean disponible)
    {
    	this.disponible = disponible;
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
	
	public double getKilometrage()
	{
		return kilometrage;
	}
	
	public boolean getDisponible()
    {
    	return this.disponible;
    }
	
	public void setKilometrage(double kilometrage)
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

    /**
     * @return the classe
     */
    public String getClasseDeVehicule() {
        return classe;
    }

    /**
     * @param classe2 the classe to set
     */
    public void setClasse( String classe2 ) {
        this.classe = classe2;
    }

	public String getTypeDePermisNecessaire() {
		return this.typeDePermisNecessaire;
	}
	
	public void setTypeDePermisNecessaire(String typeDePermisNecessaire)
	{
		this.typeDePermisNecessaire = typeDePermisNecessaire;
	}
}
