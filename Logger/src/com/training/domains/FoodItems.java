package com.training.domains;

public class FoodItems {
	
	private int itemCode;
	private String itemName;
	private double rate;
	private boolean isVeg;
	
	public FoodItems(int itemCode, String itemName, double rate, boolean isVeg) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.rate = rate;
		this.isVeg = isVeg;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public boolean isVeg() {
		return isVeg;
	}
	
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	@Override
	public String toString() {
		return "\n\nFoodItems \nitemCode = " + itemCode + ", \nitemName = " + itemName + ", \nrate = " + rate + ", \nisVeg = " + isVeg;
	}

	
	
	

}
