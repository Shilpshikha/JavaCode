package com.training.apps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;

public class InjectSimpleValues {

	public static void main(String[] args) {
		
		BeanFactory container = new ClassPathXmlApplicationContext("bean2.xml");
//		Customer cust1 = (Customer)container.getBean("custBean1");
//		Customer cust2 = (Customer)container.getBean("custBean1",Customer.class);
		Customer cust3 = (Customer)container.getBean("custBean2",Customer.class);
		
//		System.out.println("Customer1 " + cust1);
//		System.out.println("Customer1 " + cust2);
		System.out.println("Customer2 " + cust3);
		
//		System.out.println("Hash Code customer1 " + cust1.hashCode());
//		System.out.println("Hash Code customer1 " + cust2.hashCode());
		System.out.println("Hash Code customer2 " + cust3.hashCode());
		

	}

}
