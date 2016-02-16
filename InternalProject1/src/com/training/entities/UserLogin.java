package com.training.entities;

public class UserLogin {
	
	private String username;
	private String empid;
	private String password;
	private String role;
	
	public UserLogin(String username,String empid, String password, String role) {
		super();
		this.username = username;
		this.empid = empid;
		this.password = password;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
