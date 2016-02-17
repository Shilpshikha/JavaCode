package com.training.crea.factory;

public class Client {

	public static void main(String[] args) {
	
		LoanAccount account1 = LoanFactory.getInstance();
		
		System.out.println("Amount calculated for Personal Loan " + account1.calcAmt(25000.00) );
		
		LoanAccount account2 = LoanFactory.getInstance(LoanType.HOUSINGLOAN);
		System.out.println("Amount calculated for Housing Loan " + account1.calcAmt(900000.00) );

	}

}
