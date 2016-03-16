package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private int pid;
	private String name;
	private String email;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person(int pid, String name, String email) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", email=" + email + "]";
	}
	
}
