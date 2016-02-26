package com.training.apps;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		
		String name = null;
		int len=0;
		try{
			System.out.println(args[0]);
			System.out.println(name.length());
			len = name.length();
		}
		
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(" Use Run config -to enter command line");
	}
		catch(NullPointerException e){
			System.out.println("Check Attribute name - It may be Null");
		}
		System.out.println(len);
	}

}
