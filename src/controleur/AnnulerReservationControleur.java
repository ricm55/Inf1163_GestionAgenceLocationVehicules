package controleur;

import controleur.ClientControleur;

public class AnnulerReservationControleur {
	
	private ClientControleur client ;
	
	public AnnulerReservationControleur(String nom, String telephone) 
	{
		this.client = new ClientControleur(nom, telephone);
	}
	
	


}
