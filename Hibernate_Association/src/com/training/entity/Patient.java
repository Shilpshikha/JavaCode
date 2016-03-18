package com.training.entity;

public class Patient {

	private int patientId;
	private String patientName;
	private long handPhone;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientName, long handPhone) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.handPhone = handPhone;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", handPhone=" + handPhone + "]";
	}
	
	public double calculate(){
		return 5000.00;
	}
}
