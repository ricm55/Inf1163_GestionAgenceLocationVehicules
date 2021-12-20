package background;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import stockage.StockageVehicule;

public class CatalogueVehicule {
	
	private List<Vehicule> listeDeVehicule;
	private List<Vehicule> listeEconomique ;
	private List<Vehicule> listeMoyenne ;
	private List<Vehicule> listeConfort ;
	private List<Vehicule> listeLuxe ;
	private List<Vehicule> listeUtilitaire;
	
	
	
	public CatalogueVehicule() throws SQLException
	{
		this.listeEconomique = StockageVehicule.getVehicules("Economique");
		this.listeMoyenne = StockageVehicule.getVehicules("Moyenne");
		this.listeConfort = StockageVehicule.getVehicules("Confort");
		this.listeLuxe = StockageVehicule.getVehicules("Luxe");
		this.listeUtilitaire = StockageVehicule.getVehicules("Utilitaire");
	}
	
	public List<Vehicule> getListeDeVehicule(String vehiculeType) throws SQLException
	{
		
		switch (vehiculeType) {
		
		case "ECONOMIQUE" :
			return listeDeVehicule = StockageVehicule.getVehicules("Economique");
	
		case "MOYENNE" :
			return listeDeVehicule = StockageVehicule.getVehicules("Moyenne");
		
		case "CONFORT" : 
			return listeDeVehicule = StockageVehicule.getVehicules("Confort");
			
		case "LUXE" : 
			return listeDeVehicule = StockageVehicule.getVehicules("Luxe");
			
		case "UTILITAIRE" : 
			return listeDeVehicule = StockageVehicule.getVehicules("Utilitaire");
		}
		return null;
		
		
	}
	
	
	public void setListeDeVehicule(Vehicule vehicule)
	{
		String vehiculeType = vehicule.getClasseDeVehicule();
		switch (vehiculeType) {
		
		case "Economique" :
			 this.listeEconomique.add(vehicule);
	
		case "Moyenne" :
			this.listeMoyenne.add(vehicule);
		
		case "Confort" : 
			this.listeConfort.add(vehicule);
			
		case "Luxe" : 
			this.listeLuxe.add(vehicule);
			
		case "Utilitaire" : 
			this.listeUtilitaire.add(vehicule);
}
	}
	
	public ArrayList<Vehicule> getVehicules(String type) throws SQLException {
		return StockageVehicule.getVehicules(type);
	}
		

}
