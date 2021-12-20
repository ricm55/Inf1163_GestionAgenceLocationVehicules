package controleur;

import background.Reservation;
import controleur.ClientControleur;

public class ReservationControleur {
	
	private ClientControleur client ;
	
	public ReservationControleur(String nom, String telephone) 
	{
		this.client = new ClientControleur();
	}
	
	public boolean annulerReservationControleur(Reservation reservation)
	{
		return this.client.enleverReservation(reservation);

	}
	
	
	
	


}
