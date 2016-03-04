package com.training.beans;

import java.io.Serializable;
import java.util.logging.*;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	private long customerId;
	private String customerName;
	private String email;
	private long handPhone;
	
	public Customer() {
		super();
		log.info("Constructor initialized");
		// TODO Auto-generated constructor stub
	}

	public long getCustomerId() {
		log.info("Get customer id called");
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
		log.info("Set customer id called");
		
	}

	public String getCustomerName() {
		log.info("Get customer name called");
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		log.info("Set customer name called");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		log.info("Set customer email called");
		this.email = email;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		log.info("Set customer handPone called");
		this.handPhone = handPhone;
	}


	public String getInfo(){
		return "Mesage From Bean";
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", handPhone=" + handPhone + "]";
	}
	
	
	

}
