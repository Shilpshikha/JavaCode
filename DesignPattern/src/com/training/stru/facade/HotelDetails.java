package com.training.stru.facade;

import java.util.HashMap;

//get hotel details
public class HotelDetails implements ReservationDetails{

	private HashMap<String,Integer> hotels;
	
	public HotelDetails() {
		super();
		hotels = new HashMap<String,Integer>();
	}

	public HashMap<String, Integer> getHotels() {
		return hotels;
	}


	public void setHotels(HashMap<String, Integer> hotels) {
		this.hotels = hotels;
	}
	
	public HashMap<String, Integer> getTulipDetails() {
		hotels.put("TULIP", 30);
		return hotels;
	}
	
	public HashMap<String, Integer> getBlueDetails() {
		hotels.put("BLUE", 40);
		return hotels;
	}

	@Override
	public HashMap<String, Integer> getDetails() {
		getTulipDetails();
		getBlueDetails();
		return hotels;
	}

	
}
