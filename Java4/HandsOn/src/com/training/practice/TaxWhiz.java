/**
 * 1. Define a class named TaxWhiz that computes the sales tax for a purchase. 
 * It should store the current tax rate as an instance variable. 
 * you can initialize the rate using the Constructor . 
 * 
 * a. This class should have one public method, calcTax(double purchase), 
 * which returns a double, whose value is purchases times the tax rate. 
 */

package com.training.practice;

public class TaxWhiz {
	 
	private double currTax;
	
	TaxWhiz(){
		currTax = 14.7;
	}
	
	public double calcTax(double purchase){
		return purchase * (currTax/100);
	}

}
