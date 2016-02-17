package com.training.stru.adaptar;

public class LifeInsurance {

	private double policyAmount;
	
	public LifeInsurance(double policyAmount){
		this.policyAmount = policyAmount;
	}
	
	public double calculatePremium(){
		return policyAmount * 0.25;
	}
}
