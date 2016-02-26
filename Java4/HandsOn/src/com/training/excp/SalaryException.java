package com.training.excp;

public class SalaryException extends Exception {
	
	private double salary;
	private String type;

	public SalaryException(double salary, String type) {
		super();
		this.salary = salary;
		this.type = type;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return salary + " is not in specified range for " + type ;
	}
	
	
	
}
