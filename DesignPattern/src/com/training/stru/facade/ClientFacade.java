package com.training.stru.facade;

public class ClientFacade {

	public static void main(String[] args) {
		
		ReservationFacade res = new ReservationFacade();
		res.getAvailability();

	}

}
