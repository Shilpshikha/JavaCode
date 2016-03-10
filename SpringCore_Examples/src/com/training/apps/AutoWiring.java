package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

public class AutoWiring {

	public static void main(String[] args) {
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("AutoWire.xml");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("AutoWire.xml");

		Invoice inv = ctx.getBean("invoice",Invoice.class);
		
		System.out.println(inv.getCust());
		System.out.println(inv.getInvoiceNumber());
		System.out.println(inv.getAmount());
		
		System.out.println(inv);
		
		ctx.close();
	}

}
