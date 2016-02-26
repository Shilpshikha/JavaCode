package com.training.entities;

public class Employees {

	private String empid;
	private String name;
	private String date_of_birth;
	private String date_of_join;
	private long phone;
	private String address;
	private double salary;
	
	public Employees(String empid, String name, String date_of_birth, String date_of_join, long phone, String address,
			double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.date_of_join = date_of_join;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getDate_of_join() {
		return date_of_join;
	}

	public void setDate_of_join(String date_of_join) {
		this.date_of_join = date_of_join;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n\nEmployees \nEmp id : " + empid + "\nName : " + name + "\nDate of Birth : " + date_of_birth + "\nDate of Join : "
				+ date_of_join + "\nPhone : " + phone + "\nAddress : " + address + "\nSalary : " + salary;
	}
	
	
	
}
