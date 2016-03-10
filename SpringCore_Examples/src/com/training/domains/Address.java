package com.training.domains;

public class Address {

	private String addrLine1;
	private String city;
	private String pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String addrLine1, String city, String pincode) {
		super();
		this.addrLine1 = addrLine1;
		this.city = city;
		this.pincode = pincode;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addrLine1=" + addrLine1 + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
