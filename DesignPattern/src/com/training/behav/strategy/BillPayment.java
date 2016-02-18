package com.training.behav.strategy;

public class BillPayment {
	
	private PaymentStrategy pay;

	public BillPayment() {
		super();
	}
	

	public PaymentStrategy getPay() {
		return pay;
	}

	public void setPay(PaymentStrategy pay) {
		this.pay = pay;
	}
	
	//	Collections.sort(new Comparator)
	
	public String makePayment(double amt, String description){
		return pay.pay(amt, description);
	}

}
