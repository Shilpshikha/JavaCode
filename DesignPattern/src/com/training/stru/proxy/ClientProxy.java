package com.training.stru.proxy;

public class ClientProxy {

	public static double print(CalculateBean bean){
		//CalculateBeanReal bean = new CalculateBeanReal();
		return bean.farenToCelsius(212);
	}
	public static void main(String[] args) {
		CalculateBeanProxy proxy = new CalculateBeanProxy();
		System.out.println("Farenheit to celsius : " + proxy.farenToCelsius(212));
		System.out.println(print(proxy));

	}

}
