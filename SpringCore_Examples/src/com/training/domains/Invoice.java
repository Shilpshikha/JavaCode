package com.training.domains;

import java.util.HashMap;
import java.util.List;

public class Invoice {

	private long invoiceNumber;
	private double amount;
	
	private List<Item> lst;
	private HashMap<String,Double> taxes;
	private Customer cust;

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice(long invoiceNumber, double amount, List<Item> lst, HashMap<String, Double> taxes, Customer cust) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.amount = amount;
		this.lst = lst;
		this.taxes = taxes;
		this.cust = cust;
	}

	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	

	public List<Item> getLst() {
		return lst;
	}

	public void setLst(List<Item> lst) {
		this.lst = lst;
	}

	
	public HashMap<String, Double> getTaxes() {
		return taxes;
	}

	public void setTaxes(HashMap<String, Double> taxes) {
		this.taxes = taxes;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", amount=" + amount + ", lst=" + lst + ", taxes=" + taxes
				+ ", cust=" + cust + "]";
	}




	
}
