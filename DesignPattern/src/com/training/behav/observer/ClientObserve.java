package com.training.behav.observer;
//Client is Chef
public class ClientObserve {

	public static void main(String[] args) {
		
		MealOrder order = new MealOrder();
		
		order.addObserver(new Waiter());
		
		order.setStatus("Accepted");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		order.setStatus("Completed");

	}

}
