package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;

public class Const_RefBean {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean2.xml");
		
		Customer cust = ctx.getBean(Customer.class);
		
		System.out.println(cust);
		System.out.println(cust.getAddr());

		
	}

}
