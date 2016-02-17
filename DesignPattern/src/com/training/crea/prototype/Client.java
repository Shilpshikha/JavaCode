package com.training.crea.prototype;

public class Client {

	public static void main(String[] args) {
		
		Employee empOriginal = new Employee(101,"Samar");
		Employee empProto =null;
		
		System.out.println("Original" + empOriginal);

		try {
		
			 empProto = (Employee)empOriginal.clone();
			 empProto.setEmpname("Samar Pratap");
		
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
	
		System.out.println("Original : " + empOriginal);
		System.out.println("Prototype : " + empProto);
	
	}
	

}
