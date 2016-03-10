package com.training.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;
import com.training.domains.Item;

public class CollectionInjection {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Coll_Injection.xml");

		Invoice inv = ctx.getBean("invoice1",Invoice.class);
		
		System.out.println("Customer 1 : " + inv.getCust());
		System.out.println("Invoice number : " +inv.getInvoiceNumber());
	
		
		System.out.println(inv);
		
		List<Item> itemList = inv.getLst();
		
		
		
		for(Item obj: itemList){
			System.out.print(obj);
		}
		
		System.out.println("Amount : " +inv.getAmount());
		
		System.out.println("Invoice : "+ inv);
		
		//System.out.println(itemList);

	}

}
