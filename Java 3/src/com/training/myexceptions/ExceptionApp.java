package com.training.myexceptions;

public class ExceptionApp {

	public static void main(String[] args)  //throws Exception{
		{// TODO Auto-generated method stub
		try{
			Customer cust = new Customer("Amar",7,"grams",100,9000);
		}catch(RangeCheckException e){
		
		System.out.println(e.getMessage());
	//	throw new Exception();
	}
		finally{
			System.out.println("Inside finally");
		}
		System.out.println("bye");
	}
}


