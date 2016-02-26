package com.training.polymorphism;

public class Vessels extends Items {

	private String material;
	private String size;
	
	
	public Vessels(int serialNum, double rate,int days, String material, String size) {
		super(serialNum,rate, days);
		this.material = material;
		this.size = size;
	}


	@Override
	public void getDetails(int serialNum) {
		System.out.println("Serialnum : " + serialNum);
		System.out.println("rate : " + rate);
		System.out.println("Material : " + material);
		System.out.println("Size : " + size);
		System.out.println("Days : " + days);
	}


	@Override
	public double getRent(double rate, int days) {
		return rate * days *0.4;
	}

	public double getRate() {
		return super.rate;
	}
}
