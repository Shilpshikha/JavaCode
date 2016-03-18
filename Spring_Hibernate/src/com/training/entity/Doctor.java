package com.training.entity;

import com.training.domains.Address;

public class Doctor {

	private int doctorId;
	private String doctorName;
	private long handPhone;
	private Address homeAddr;
	private Address clinicAddr;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Doctor(int doctorId, String doctorName, long handPhone, Address homeAddr, Address clinicAddr) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.homeAddr = homeAddr;
		this.clinicAddr = clinicAddr;
	}



	public int getDoctorId() {
		return doctorId;
	}
	
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	public long getHandPhone() {
		return handPhone;
	}
	
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	
	
	public Address getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}

	public Address getClinicAddr() {
		return clinicAddr;
	}

	public void setClinicAddr(Address clinicAddr) {
		this.clinicAddr = clinicAddr;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", homeAddr=" + homeAddr + ", clinicAddr=" + clinicAddr + "]";
	}

	
	
	
}
