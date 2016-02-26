package com.training.crea.factory;
/**
 * 
 * 
 * Sub class - II, Product -II
 * 
 */

public class PersonalLoan extends LoanAccount {

	private double processingFee;
	
	protected PersonalLoan(double interestRate, double processingFee) {
		super(interestRate);
		this.processingFee = processingFee;
	
	}

	@Override
	public double calcAmt(double loanAmt) {
		
		 return ((loanAmt * getInterestRate()) / 100) + loanAmt + processingFee;
	}

}
