package com.training.stru.facade;
//import java.util.*;
public class ReservationFacade {

	//get availability
	FlightDetails fdetails;
	HotelDetails hdetails;
	
	public ReservationFacade(){
		fdetails = new FlightDetails();
		hdetails = new HotelDetails();
	}
	
	public void getAvailability(){
		System.out.println("Flight Details : " + fdetails.getDetails());
		System.out.println("Hotel Details : " + hdetails.getDetails());
	}
}
