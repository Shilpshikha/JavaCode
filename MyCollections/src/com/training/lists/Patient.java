package com.training.lists;

public class Patient implements Comparable<Patient>{
	
	private int pid;
	private String pname;
	private int age;
	private long phoneno;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Patient(int pid,String pname, int age, long phoneno) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.phoneno = phoneno;
	}

	@Override
	public int compareTo(Patient o) {
		if(pid>o.pid)
			return 1;
		if(pid<o.pid) return -1;
		return 0;
	}


	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", age=" + age + ", phoneno=" + phoneno + "]";
	}


	
	

}
