package background;

public class RetourLocation {
	
	private Location location;
	private double deuxiemeVersement;
	private double dommages;
	

	public RetourLocation(Location location) {
		// TODO Auto-generated constructor stub
		this.location = location;
		this.deuxiemeVersement = this.location.getDeuxiemeVersement();
		this.dommages = 0.0;
		
	}
	/*
	
	public void mettreAJourVehicule(double niveauReservoir, int kilometrage, double dommages) 
	{
		this.location.getVehicule().setNiveauReservoir(niveauReservoir);;
		this.location.getVehicule().setKilometrage(kilometrage);
		this.location.getDeuxiemeVersement().addDommages(dommages);
		this.dommages = this.dommages + dommages;
		
	}
	*/
	
	public void setDeuxiemeVersement(double versement)
	{
		this.deuxiemeVersement = versement;
	}
	
	public double getDeuxiemeVersement() 
	{
		return this.deuxiemeVersement;
	}
	
	public boolean payer(double montant)
	{
		this.setDeuxiemeVersement(this.deuxiemeVersement - montant);
		
		if (this.deuxiemeVersement > 0) 
		{
			
			return false;
		}
		
		else 
		{
			
			return true;
		}
		
	}
	
	public double retourMonnaie()
	{
		if (this.getDeuxiemeVersement() < 0 )
		{
			return this.getDeuxiemeVersement() * -1;
		}
		else 
		{
			return 0;
		}
	}
	
	public void retourVehicule(Location location)
	{
		this.location.getVehicule().setDisponible(true);
		
	}
	
	public String recu(Location location)
	{
		
		String retour = "retour";
		return retour;
	}
	
	

}
