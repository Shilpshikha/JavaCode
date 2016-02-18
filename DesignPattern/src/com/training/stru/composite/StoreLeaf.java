package com.training.stru.composite;



public class StoreLeaf implements Profitable {

	private double profit;
	private String storeName;
	//private List<Profitable> profList;
	
	public StoreLeaf(double profit, String storeName) {
		super();
		this.profit = profit;
		this.storeName = storeName;
		//profList = new ArrayList<Profitable>();
	}
	
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}


	@Override
	public double getProfit() {
		
		return this.profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		

	}

	@Override
	public void removeLeaf(Profitable child) {
		

	}

}
