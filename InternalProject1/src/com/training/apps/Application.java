package com.training.apps;

import java.util.Scanner;

import com.training.daos.EmployeeDAO;
import com.training.daos.UserDAO;
import com.training.entities.Employees;
import com.training.entities.UserLogin;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException {
	
		Employees emp1 = new Employees("102A","ANUBHAV","22-jan-1987","18-mar-2009",98746045,"new delhi",50000.00);
		EmployeeDAO empd = new EmployeeDAO();
		
		//System.out.println(empd.add(emp1) + " ROW ADDED");
		
		
		//System.out.println(empd.findAll());
		
		UserLogin usr1 = new UserLogin("ars1221","102A","asd098","waiter");
		UserDAO usrd = new UserDAO();
		
		//System.out.println(usrd.add(usr1));
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username = in.next();
		System.out.println("Enter password : ");
		String password = in.next();
		System.out.println("Enter role : ");
		String role = in.next();
		usrd.isCorrect(username,password,role);

	}

}
