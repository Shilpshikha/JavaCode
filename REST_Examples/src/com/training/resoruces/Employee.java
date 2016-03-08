package com.training.resoruces;

public class Employee {

	private long empid;
	private String empname;
	
	public Employee(long empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	
}
