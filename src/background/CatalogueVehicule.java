package background;

import java.util.List;

public class CatalogueVehicule {
	
	private List<Vehicule> listeDeVehicule;
	
	public CatalogueVehicule(List<Vehicule> listeDeVehicule)
	{
		this.listeDeVehicule = listeDeVehicule;
	}
	
	public List<Vehicule> getListeDeVehicule()
	{
		return this.listeDeVehicule;
	}
	
	public void setListeDeVehicule(Vehicule vehicule)
	{
		this.listeDeVehicule.add(vehicule);
	}

}
