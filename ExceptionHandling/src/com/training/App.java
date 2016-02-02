package com.training;

public class App {

	public static void main(String[] args) {//throws NullPointerException{
	
		Converter obj = new Converter();
		double cel = obj.farenToCelsius(46.00);
		System.out.println("Celsius value of 45F " + cel);
			
		
		Double faren=null;
		double cel2 = 0.0;
		//try {
			cel2 = obj.farenToCelsius(faren);
	//	} catch (NullPointerException e) {
			
		//	System.out.println("Faren is NULL - Check");
			//System.out.println(e.getMessage());
			// TODO: handle exception
	//	}
	System.out.println("Celsius value of  " + cel2);
	
		
	}	
}
