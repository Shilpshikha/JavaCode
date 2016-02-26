/**
 * 
4. Exception Handling  
1. Create a user defined exception to check whether Employee Salary matches the 
minimum salary  as given below, if not throw the exception 
a. For unskilled employees Rs. 85000 
b. For semi skilled employee  Rs.9500 
c. For skilled Employee 10500 
d. Create Employee class with required attributes 
e. Throw an exception if it is less than the prescribed limit 
f. Use the catch and finally block to make an appropriate message Construct 
g. Check the application with a Sample Program 
 */

package com.training.excp;

public class Employee {
	
	private String name;
	private long handphone;
	private String add;
	private String type;
	private double salary;
	
	
	public Employee(String name, long handphone, String add, String type, double salary) throws SalaryException {
		super();
		this.name = name;
		this.handphone = handphone;
		this.add = add;
		this.type = type;
		//this.salary = salary;
		
		if(type.equals("unskilled")){
			
			if(salary<8500){
				throw new SalaryException(salary,type);
			}
			else 
				this.salary = salary;
		}
		
		else if(type.equals("semi-skilled")){
			if(salary<9500){
				throw new SalaryException(salary,type);
			}
			else
				this.salary = salary;
		}
		
		else if(type.equals("skilled")){
			if(salary<10500){
				throw new SalaryException(salary,type);
			}
			else this.salary = salary;
		}
		
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
