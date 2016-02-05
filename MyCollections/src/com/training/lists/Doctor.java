package com.training.lists;

import java.util.TreeSet;

//import java.util.ArrayList;
//import java.util.Collections;

public class Doctor implements Comparable<Doctor>{

	private long docId;
	private String docName;
	private String specialization;
	
	private TreeSet<Patient> patients;
	


	public Doctor() {
		super();
		
	}
	
	public Doctor(long docId, String docName, String specialization) {
		super();
		this.docId = docId;
		this.docName = docName;
		this.specialization = specialization;
	}
	
	//One to many relationship - One doctor has many patients
	public TreeSet<Patient> getPatients() {
		return patients;
	}

	public void setPatients(TreeSet<Patient> patients) {
		this.patients = patients;
	}

	public long getDocId() {
		return docId;
	}

	public void setDocId(long docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "\nDoctor : \nId = " + docId + " \nName = " + docName + "\nSpecialization = " + specialization ;
	}

	@Override
	public int compareTo(Doctor o) {
//		ArrayList<String> names = new ArrayList<String>();
//		names.add(docName);
//		Collections.sort(names);
//		if(docName.equals(o.docName)) return 1;
//		else return -1;
		if(docId<o.docId)return 1;
		if(docId>o.docId)return -1;
		return 1;
	}
	
	
	
}
