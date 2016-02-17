package com.training.stru.adaptar;

public class BankAccount {
	
	private double principle;
	
	public BankAccount(double principle){
		this.principle = principle;
	}
	
	public double calculate(){
		return principle * .10;
	}

}
