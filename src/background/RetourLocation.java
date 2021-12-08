package background;

public class RetourLocation {
	
	private Location location;
	private Paiement deuxiemeVersement;
	

	public RetourLocation(Location location) {
		// TODO Auto-generated constructor stub
		this.location = location;
		this.deuxiemeVersement = this.location.getDeuxiemeVersement();
		
	}
	
	public Paiement getDeuxiemeVersement() 
	{
		return this.deuxiemeVersement;
	}
	
	
	public void retourVehicule(Location location)
	{
		
		
	}
	
	public String recu(Location location)
	{
		
		String retour = "retour";
		return retour;
	}
	
	

}
