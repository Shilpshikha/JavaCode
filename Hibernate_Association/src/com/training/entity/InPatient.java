package com.training.entity;

import java.sql.Timestamp;

public class InPatient extends Patient {

	private int wardNumber;
	private Timestamp dateOfAdmission;

	public InPatient() {
		super();
		
	}

	public InPatient(int patientId, String patientName, long handPhone,int wardNumber, Timestamp dateOfAdmission) {
		super(patientId, patientName, handPhone);
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
	}

	public int getWardNumber() {
		return wardNumber;
	}
	
	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}
	
	public Timestamp getDateOfAdmission() {
		return dateOfAdmission;
	}
	
	public void setDateOfAdmission(Timestamp dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	
	@Override
	public String toString() {
		return "InPatient [wardNumber=" + wardNumber + ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	@Override
	public double calculate(){
		return 10000.00;
	}
}
