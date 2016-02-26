package com.training.stru.facade;

import java.util.HashMap;

public class FlightDetails implements ReservationDetails{
 //get flight details
	private HashMap<String,Integer> flight;

	public FlightDetails(){
		flight = new HashMap<String,Integer>();
	}

	public HashMap<String, Integer> getFlight() {
		return flight;
	}

	public void setFlight(HashMap<String, Integer> flight) {
		this.flight = flight;
	}
	
	public HashMap<String, Integer> getIndigoFlight() {
		flight.put("DEL-BOM", 10);
		return flight;		
	}
	
	public HashMap<String, Integer> getSpiceJetFlight() {
		flight.put("DEL-KOL", 50);
		return flight;		
	}

	@Override
	public HashMap<String, Integer> getDetails() {
		getIndigoFlight();
		getSpiceJetFlight();
		return flight;
	}
}
