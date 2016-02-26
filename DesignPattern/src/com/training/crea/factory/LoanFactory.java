package com.training.crea.factory;
/**
 * 
 * 
 * Factory Class with Static method to create instance of subclass
 * 
 */

public class LoanFactory {

	public static LoanAccount getInstance(LoanType type){
		return getLoanAccount(type);
	}
	
	public static LoanAccount getInstance(){
		
		return getLoanAccount(LoanType.PERSONALlOAN);
		
	}

	private static LoanAccount getLoanAccount(LoanType type) {
	
		LoanAccount acc = null;
		switch(type){
		
		case PERSONALlOAN :
			acc = new PersonalLoan(5.0,200.0);
			break;
		case HOUSINGLOAN:
			acc = new HousingLoan(7.0);
			break;
		default:
			acc = null;
		}
		return acc;
	}
}
