package com.training.behav.strategy;

public class ClientStrategy {

	public static void main(String args[]){
		
		CardPayment p1 = new CardPayment();
		
		BillPayment bill = new BillPayment();
		bill.setPay(p1);
		System.out.println(bill.makePayment(5000, "ICICI 2233 6673 8900 1123"));
	}
}
