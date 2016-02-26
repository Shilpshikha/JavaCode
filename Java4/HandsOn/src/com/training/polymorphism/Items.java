/**
 * 3. Polymorphism 

1. “Chennai rentals” rents different items like Fans, Furniture, Air Conditioner, Vessels 
etc, All The items that are rented has a Serial Number. 
a. Use Appropriate Class Hierarchy with base class being an Abstract Class 
b. Write a program that takes in a Serial Number and writes the information on 
given item to the console. 
 */

package com.training.polymorphism;

public abstract class Items {
	
	protected int serialNum;
	protected double rate;
	protected int days;
	
	public Items(int serialNum, double rate,int days) {
		super();
		this.serialNum = serialNum;
		this.rate = rate;
		this.days = days;
	}

	public abstract void getDetails(int serialNum);
	public abstract double getRent(double rate,int days);
	

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
