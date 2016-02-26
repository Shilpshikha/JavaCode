package com.training.stru.proxy;

public class CalculateBeanReal implements CalculateBean{

	public double farenToCelsius(double faren){
		return ((faren-32) *(5.0/9.0));
	}
}
