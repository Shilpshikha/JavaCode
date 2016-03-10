package com.training.domains;

import java.util.logging.Logger;

public class Customer {

	private int customerId;
	private String customerName;
	private long phoneNumber;
	
	Address addr;
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	public Customer() {
		super();
		log.info("Customer initialized");
		// TODO Auto-generated constructor stub
	}


	public Customer(int customerId, String customerName, long phoneNumber, Address addr) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.addr = addr;
	}


	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
		log.info("Set Customer id called");
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		log.info("Set Customer name called");
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
		log.info("Set Customer phone called");
	}

	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}

	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", addr=" + addr + "]";
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	
	
}
