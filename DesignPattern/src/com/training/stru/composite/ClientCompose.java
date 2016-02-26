package com.training.stru.composite;

public class ClientCompose {

	public static void main(String[] args) {
		
		StoreLeaf s1 = new StoreLeaf(300.00,"Big Bazar");
		StoreLeaf s2 = new StoreLeaf(400.00,"KFC");
		StoreLeaf s3 = new StoreLeaf(200.00,"Dosa Plaza");
		
		CityLeaf delhi = new CityLeaf("Delhi");
		
		delhi.addLeaf(s1);
		delhi.addLeaf(s2);
		delhi.addLeaf(s3);
		
		System.out.println("Total collection Delhi : " + delhi.getProfit()) ;
		
		StoreLeaf s4 = new StoreLeaf(700.00,"Baskin n Robbins");
		StoreLeaf s5 = new StoreLeaf(500.00,"Momo Corner");
		StoreLeaf s6 = new StoreLeaf(100.00,"CCD");
		
		CityLeaf noida = new CityLeaf("Noida");
		noida.addLeaf(s4);
		noida.addLeaf(s5);
		noida.addLeaf(s6);
		System.out.println("Total collection Noida : " + noida.getProfit());
		
		StateLeaf ncr = new StateLeaf("NCR");
		ncr.addLeaf(delhi);
		ncr.addLeaf(noida);
		
		System.out.println("Total Collection NCR  : " + ncr.getProfit());

	}

}
