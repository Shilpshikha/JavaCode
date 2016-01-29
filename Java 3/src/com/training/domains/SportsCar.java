package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 900000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Ferrari";
	}

}
