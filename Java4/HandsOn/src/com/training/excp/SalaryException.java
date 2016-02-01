package com.training.excp;

public class SalaryException extends Exception {
	
	private double salary;

	public SalaryException(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return salary + " is not in specified range for " ;
	}
	
	
	
}
