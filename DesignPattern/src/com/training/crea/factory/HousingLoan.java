package com.training.crea.factory;
/**
 * 
 * 
 * Sub class - I , Product - I
 * 
 */

public class HousingLoan extends LoanAccount {

	protected HousingLoan(double interestRate) {
		super(interestRate);
	}

	@Override
	public double calcAmt(double loanAmt) {
		
		return ((loanAmt * getInterestRate()) / 100) + loanAmt;
	}
	
	

}
