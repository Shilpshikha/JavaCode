package com.training.myexceptions;

//import com.bank.RangeCheckException;

public class Customer {
	private String name;
	private long handphone;
	private String loantype;
	private long amt;
	private double salary;
	
	public Customer() {
		super();
	}

	//Declare Rule
	public Customer(String name, long handphone, String loantype, long amt, double salary) throws RangeCheckException {
		super();
		this.name = name;
		this.handphone = handphone;
		this.loantype = loantype;
		this.amt =amt;
		this.salary=salary;
		
		if(handphone<9)
		{
			throw new RangeCheckException(handphone);
		}
		else
			this.handphone=handphone;
	}
	
	public long getAmt() {
		return amt;
	}


	public void setAmt(long amt) {
		this.amt = amt;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getLoantype() {
		return loantype;
	}


	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getHandphone() {
		return handphone;
	}

	//Handle Rule
	public void setHandphone(long handphone) {
		if(handphone<9)
		{
			try{
			throw new RangeCheckException(handphone);
			}
			catch(RangeCheckException e){
				e.printStackTrace();
			}
		}
		else
		this.handphone = handphone;
	}
	
	public void getDetails(){
		System.out.println("Enter customer details : ");
		System.out.println("Enter name : ");
		System.out.println("Enter handphone : ");
		System.out.println("Enter loantype : ");
		System.out.println("Enter amt : ");
		System.out.println("Enter salary : ");
	}
}
