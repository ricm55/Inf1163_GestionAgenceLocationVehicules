package background;

public class Tarif
{
	private double assurance;
	private double retard;
	private double reparation;
	private double classeUtilitaire;
	private double classeLuxe;
	private double classeConfort;
	private double classeMoyenne;
	private double classeEconomique;
	
	public Tarif(double assurance, double retard, double reparation, double classeUtilitaire, double classeLuxe,
			double classeConfort, double classeMoyenne, double classeEconomique)
	{
		this.assurance = assurance;
		this.retard = retard;
		this.reparation = reparation;
		this.classeUtilitaire = classeUtilitaire;
		this.classeLuxe = classeLuxe;
		this.classeConfort = classeConfort;
		this.classeMoyenne = classeMoyenne;
		this.classeEconomique = classeEconomique;
	}
	
	
	
	public double getAssurance()
	{
		return assurance;
	}
	
	public void setAssurance(double assurance)
	{
		this.assurance = assurance;
	}
	
	public double getRetard()
	{
		return retard;
	}
	
	public void setRetard(double retard)
	{
		this.retard = retard;
	}
	
	public double getReparation()
	{
		return reparation;
	}
	
	public void setReparation(double reparation)
	{
		this.reparation = reparation;
	}
	
	public double getClasseUtilitaire()
	{
		return classeUtilitaire;
	}
	
	public void setClasseUtilitaire(double classeUtilitaire)
	{
		this.classeUtilitaire = classeUtilitaire;
	}
	
	public double getClasseLuxe()
	{
		return classeLuxe;
	}
	
	public void setClasseLuxe(double classeLuxe)
	{
		this.classeLuxe = classeLuxe;
	}
	
	public double getClasseConfort()
	{
		return classeConfort;
	}
	
	public void setClasseConfort(double classeConfort)
	{
		this.classeConfort = classeConfort;
	}
	
	public double getClasseMoyenne()
	{
		return classeMoyenne;
	}
	
	public void setClasseMoyenne(double classeMoyenne)
	{
		this.classeMoyenne = classeMoyenne;
	}
	
	public double getClasseEconomique()
	{
		return classeEconomique;
	}
	
	public void setClasseEconomique(double classeEconomique)
	{
		this.classeEconomique = classeEconomique;
	}
}
