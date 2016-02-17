package com.training.stru.proxy;

public class CalculateBeanProxy implements CalculateBean {

	CalculateBeanReal bean;
	@Override
	public double farenToCelsius(double faren) {
		
		bean= new CalculateBeanReal();
		return bean.farenToCelsius(faren);
	}

}
