package com.training.apps;

import java.util.*;
import java.util.Scanner;

import com.training.daos.EmployeeDAO;
import com.training.daos.UserDAO;
import com.training.entities.Employees;
import com.training.entities.UserLogin;
import com.training.entities.*;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException {
	
		Employees emp1 = new Employees("102A","ANUBHAV","22-jan-1987","18-mar-2009",98746045,"new delhi",50000.00);
		EmployeeDAO empd = new EmployeeDAO();
		
		//System.out.println(empd.add(emp1) + " ROW ADDED");
		
		
		//System.out.println(empd.findAll());
		
		UserLogin usr1 = new UserLogin("ars1221","102A","asd098","waiter");
		UserDAO usrd = new UserDAO();
		
		//System.out.println(usrd.add(usr1));
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username = in.next();
		System.out.println("Enter password : ");
		String password = in.next();
		System.out.println("Enter role : ");
		String role = in.next();
		usrd.isCorrect(username,password,role);

		
		/*List<MenuItems> items = new ArrayList<MenuItems>();
		items.add(new MenuItems(33, "Chole Bhature", 90.00, "veg"));
		items.add(new MenuItems(20, "Noodles", 99.00, "veg"));
		*/
		
	/*	List<String> itemname = new ArrayList<String>();
		itemname.add("Dal");
		itemname.add("Rice");
		itemname.add("Roti");
		Waiter wtr1 = new Waiter(02, "102A");
		System.out.println(wtr1.placeOrder(204, itemname, 2));
		*/
		
		Chef chef1 = new Chef("102A");
		chef1.getOrders();
	}

}
