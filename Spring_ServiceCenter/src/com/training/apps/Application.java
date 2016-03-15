package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.ServiceDaoImpl;
import com.training.domains.Customer;
import com.training.domains.Product;
import com.training.domains.ServiceRequest;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		ServiceDaoImpl dao = ctx.getBean("dao",ServiceDaoImpl.class);
		ServiceRequest req = ctx.getBean("service",ServiceRequest.class);
		
		Customer cust =ctx.getBean(Customer.class);
		cust.setCustId(103);
		cust.setCustName("Sonam");
		cust.setHandPhone(9834232);
		
//		Customer cust = ctx.getBean(Customer.class);
//		System.out.println(cust);
		
		
		Product prod =ctx.getBean(Product.class);
		prod.setProdId(203);
		prod.setProdName("TV");
		
//		Product prod = ctx.getBean(Product.class);
//		System.out.println(prod);
		
		req.setRequestId(303);
		req.setDescr("No Signal");
		
//		boolean result = dao.add(req);
//		System.out.println(result);
		
		System.out.println(dao.findAll());

	}

}
