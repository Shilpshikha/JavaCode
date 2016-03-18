package com.training.entity;

import java.util.Set;

import com.training.domains.Address;

public class Doctor {

	private int doctorId;
	private String doctorName;
	private long handPhone;
	private Address homeAddr;
	private Address clinicAddr;
	
	private ClinicalAssistant assistant;
	
	private  Set<Patient> patientList;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(int doctorId, String doctorName, long handPhone, Address homeAddr, Address clinicAddr,
			ClinicalAssistant assistant) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.homeAddr = homeAddr;
		this.clinicAddr = clinicAddr;
		this.assistant = assistant;
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
	

	public ClinicalAssistant getAssistant() {
		return assistant;
	}


	public void setAssistant(ClinicalAssistant assistant) {
		this.assistant = assistant;
	}


	public Set<Patient> getPatientList() {
		return patientList;
	}


	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}


	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", homeAddr=" + homeAddr + ", clinicAddr=" + clinicAddr + ", assistant=" + assistant + "]";
	}

	

	

	
	
	
}
