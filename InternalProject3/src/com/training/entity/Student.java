package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private long rollNo;
	private String name;
	private String department;
	private double academics;
	private double acadEvents;
	private double sportsEvents;
	private double culturalEvents;
	private String image;
	
	private double grade;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(long rollNo, String name, String department, double academics, double acadEvents,
			double sportsEvents, double culturalEvents,double grade,String image) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.academics = academics;
		this.acadEvents = acadEvents;
		this.sportsEvents = sportsEvents;
		this.culturalEvents = culturalEvents;
		this.grade =grade;
		this.image=image;
	}


	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAcademics() {
		return academics;
	}

	public void setAcademics(double academics) {
		this.academics = academics;
	}

	public double getAcadEvents() {
		return acadEvents;
	}

	public void setAcadEvents(double acadEvents) {
		this.acadEvents = acadEvents;
	}

	public double getSportsEvents() {
		return sportsEvents;
	}

	public void setSportsEvents(double sportsEvents) {
		this.sportsEvents = sportsEvents;
	}

	public double getCulturalEvents() {
		return culturalEvents;
	}

	public void setCulturalEvents(double culturalEvents) {
		this.culturalEvents = culturalEvents;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	

	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public double calculate(){
		return academics*0.5 + acadEvents*0.2 + sportsEvents*0.2 + culturalEvents*0.1;
	}


	
}
