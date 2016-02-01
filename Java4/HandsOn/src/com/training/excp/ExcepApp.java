package com.training.excp;

public class ExcepApp {

	public static void main(String[] args) {
	
		//String type;
		try{
			//Employee e1 = new Employee("Samar",467823,"Delhi","skilled",3400);
			Employee e2 = new Employee("Samar",467823,"Delhi","semi-skilled",6500);
			//type=e1.getType();
			//System.out.println(type +" : ");
		}
		catch(SalaryException e){
			System.out.println(e.getMessage());
			//System.out.print(type.toString());
		}
		finally{
			System.out.println("Finally!!");
			
		}

	}

}
