package background;

public class RetourLocation {
	
	private Location location;
	private Paiement deuxiemePaiement;
	

	public RetourLocation(Location location) {
		// TODO Auto-generated constructor stub
		this.location = location;
		this.deuxiemePaiement = this.location.getDeuxiemeVersement();
		
	}
	
	public Paiement getDeuxiemePaiement(Location location) 
	{
		return this.deuxiemePaiement;
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
