package com.training.polymorphism;

public class Fan extends Items{
	
	private String brand;
	private String type;
	
	public Fan(int serialnum, double rate,int days, String brand, String type) {
		super(serialnum,rate,days);
		this.brand = brand;
		this.type = type;
	}
	
	public void getDetails(int serialNum){
		System.out.println("Serialnum : " + serialNum);
		System.out.println("rate :  " + rate);
		System.out.println("Brand : " + brand);
		System.out.println("Type : " + type);
		System.out.println("Days : " + days);
	}
	
	public double getRent(double rate, int days){
		return rate *days * 0.5;
	}
	
	public double getRate() {
		return super.rate;
	}
}
