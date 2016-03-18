package com.training.entity;

public class ClinicalAssistant {
	
	private int assisId;
	private String assisName;

	public ClinicalAssistant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ClinicalAssistant(int assisId, String assisName) {
		super();
		this.assisId = assisId;
		this.assisName = assisName;
	}
	
	public int getAssisId() {
		return assisId;
	}
	
	public void setAssisId(int assisId) {
		this.assisId = assisId;
	}
	
	public String getAssisName() {
		return assisName;
	}
	
	public void setAssisName(String assisName) {
		this.assisName = assisName;
	}
	
	@Override
	public String toString() {
		return "ClinicalAssistant [assisId=" + assisId + ", assisName=" + assisName + "]";
	}
	
	

}
