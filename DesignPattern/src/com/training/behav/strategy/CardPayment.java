package com.training.behav.strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		
		String msg = "Your payment request of INR " + amt + ", By card " + description  +", Received ";
		StringBuffer buffer = new StringBuffer(msg);
		
		double processFee = amt * 0.25;
		double total = processFee  +amt;
		
		buffer.append("\nProcessing fee of Rs. " + processFee  + " IsChargeable" );
		buffer.append("\nTotal payment  : "  + total);
		
		return buffer.toString();
	}

}
