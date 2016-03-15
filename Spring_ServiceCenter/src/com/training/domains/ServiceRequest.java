package com.training.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class ServiceRequest {


	private int requestId;
	private String descr;
	
	@Autowired
	private Customer customer;
	
	@Autowired
	private Product product;

	public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	

	@Override
	public String toString() {
		return "ServiceRequest [customer=" + customer + ", product=" + product + ", requestId=" + requestId + ", descr="
				+ descr + "\n]";
	}

	
	
	
}
