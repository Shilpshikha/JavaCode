package com.training.practice;

public class App {

	public static void main(String[] args) {
		
		TaxWhiz t = new TaxWhiz();
		System.out.println("Tax for purchase Rs.250 with current tax as 14.7 % is : " + t.calcTax(250.00));

	}

}
