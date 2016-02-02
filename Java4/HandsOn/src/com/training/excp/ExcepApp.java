package com.training.excp;

public class ExcepApp {

	public static void main(String[] args) {
	
		
		try{
			
			Employee e2 = new Employee("Samar",467823,"Delhi","semi-skilled",6500);
		}
		catch(SalaryException e){
			System.out.println(e.getMessage());
			
		}
		finally{
			System.out.println("Finally!!");
			
		}

	}

}
