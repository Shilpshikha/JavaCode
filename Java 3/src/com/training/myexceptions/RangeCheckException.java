package com.training.myexceptions;

//Inheritance
//Checked Exception - because extending Exception

public class RangeCheckException extends Exception {
	
	private long handPhone;
	
	
	//Mandatory dependency
	public RangeCheckException(long handPhone) {
		super();
		this.handPhone=handPhone;
		// TODO Auto-generated constructor stub
	}


	//Overriding Super Class Method
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return handPhone + "Should be 10 digit no.";
	}

	
	

}
