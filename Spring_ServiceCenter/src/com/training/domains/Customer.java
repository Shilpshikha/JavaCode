package com.training.domains;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	
	private int custId;
	private String custName;
	private long handPhone;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Customer(int custId, String custName, long handPhone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.handPhone = handPhone;
	}


	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", handPhone=" + handPhone + "]";
	}
	
	
	
	

}
