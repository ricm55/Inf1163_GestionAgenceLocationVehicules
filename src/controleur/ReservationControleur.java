package controleur;

import background.Reservation;
import controleur.ClientControleur;

public class ReservationControleur {
	
	private ClientControleur client ;
	
	public ReservationControleur(String nom, String telephone) 
	{
		this.client = new ClientControleur(nom, telephone);
	}
	
	public boolean annulerReservationControleur(Reservation reservation)
	{
		return this.client.enleverReservationClientControleur(reservation);

	}
	
	
	
	


}
