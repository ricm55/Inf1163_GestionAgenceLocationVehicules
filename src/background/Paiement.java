package background;

public class Paiement{

	private double montant;
	

	public Paiement(Location vehicule) {
		
		this.montant = montant;
		
	}
	
	public Paiement getDeuxiemeVersement(Assurance assurance, Forfait forfait)
	{
		
		return null;
	}
	
	public void addDommages(double dommages)
	{
		this.montant = montant + dommages;
	}
	
	public double getMontant() 
	{
		return this.montant;
	}
	
	public void setMontant(double montant)
	{
		this.montant = montant;
	}
}
