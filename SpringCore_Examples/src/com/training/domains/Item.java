package com.training.domains;

public class Item {

	private int itemNumber;
	private String itemName;
	private double reatePerUnit;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemNumber, String itemName, double reatePerUnit) {
		super();
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.reatePerUnit = reatePerUnit;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getReatePerUnit() {
		return reatePerUnit;
	}

	public void setReatePerUnit(double reatePerUnit) {
		this.reatePerUnit = reatePerUnit;
	}

	@Override
	public String toString() {
		return "Item [itemNumber=" + itemNumber + ", itemName=" + itemName + ", reatePerUnit=" + reatePerUnit + "]";
	}
	
	
}
