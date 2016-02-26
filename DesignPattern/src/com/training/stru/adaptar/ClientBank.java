package com.training.stru.adaptar;

public class ClientBank {

	public static void main(String[] args) {
		
		LifeInsurance life = new LifeInsurance(60000.00);
		
		BankAccount acc2;
	
		Adaptar acc1 = new Adaptar(500.00, life); 
		acc2 = new BankAccount(3000.00);
		
		Adaptar acc3 = new Adaptar(50000.00,life);
		
		System.out.println("Premium calculated "  + acc1.calculate());

		System.out.println("Amount calculated " + acc2.calculate());
		
		System.out.println("Total due " + acc3.findTotalDue());
	}

}
