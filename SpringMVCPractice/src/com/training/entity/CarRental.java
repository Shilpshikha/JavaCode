package com.training.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;


@Component
public class CarRental {
	
	@NotEmpty
	private String name;
	
	@Max(9999999999L)
	@Min(1000000000L)
	private long mobileNum;
	
	private String email;
	private String type;

	public CarRental() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public CarRental(String name, long mobileNum, String email, String type) {
		super();
		this.name = name;
		this.mobileNum = mobileNum;
		this.email = email;
		this.type = type;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CarRental [name=" + name + ", mobileNum=" + mobileNum + ", email=" + email + ", type=" + type + "]";
	}
	
	

}
