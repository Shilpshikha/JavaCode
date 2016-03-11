package com.training.apps;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.InvoiceDaoImpl;
import com.training.entity.Invoice;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		InvoiceDaoImpl obj = ctx.getBean("dao",InvoiceDaoImpl.class);
		Invoice inv =  ctx.getBean("invoice",Invoice.class);
		
		inv.setInvoiceNumber(201);
		inv.setCustomerName("Rahul");
		inv.setAmount(4500.00);
		
		//boolean result = obj.add(inv);
		
		//System.out.println("Row Added  : " + result);
 
		Invoice inv2 = obj.find(203);
		System.out.println(inv2);
		
		List<Invoice> inv3 = obj.findAll();
		System.out.println(inv3);
		
	}

}
