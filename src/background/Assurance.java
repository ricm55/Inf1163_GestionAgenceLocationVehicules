package background;

public class Assurance{
	
	private Location location;
	private Client client;
	private Tarif tarifAssurance;
	
	public Assurance(Location location, Tarif tarifAssurance) 
	{
		this.location = location;
		this.client = location.getClient() ; 
		this.tarifAssurance = tarifAssurance;
	}
	
	private double getMontant() 
	{
		if (!this.client.isAssurancePersonnelle())
		{
			return this.location.getDuree()*this.tarifAssurance.getAssurance(); 
		}
		return 0;
	}
	
	

}
