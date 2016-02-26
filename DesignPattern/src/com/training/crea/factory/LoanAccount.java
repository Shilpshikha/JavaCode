
package com.training.crea.factory;
/**
 * 
 * 
 * Super Type -Super class
 * 
 */

public abstract class LoanAccount {

	private double interestRate;

	protected LoanAccount(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public abstract double calcAmt(double loanAmt);
}
