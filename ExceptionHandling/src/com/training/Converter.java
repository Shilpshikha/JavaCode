package com.training;

public class Converter {
	

	public Converter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param faren
	 * @return
	 */
	public double farenToCelsius(final Double faren){
		double cel=0;
		try{
			cel = (5.0/9.0) * (faren-32);
		}catch(NullPointerException e){
			System.out.println("Farenheit should noot be null - Check again");
			System.out.println(e.getClass());
		}
			return cel;
	}
}
