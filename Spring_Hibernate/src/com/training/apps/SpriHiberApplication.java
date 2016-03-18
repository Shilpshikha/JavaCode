package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Address;
import com.training.domains.HiberSpringExample;

import com.training.entity.Doctor;

public class SpriHiberApplication {

	public static void main(String args[]){
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		HiberSpringExample dao = ctx.getBean(HiberSpringExample.class);
		
		Address add1 = new Address("HEC","Ranchi",834001);
		Address add2 = new Address("MG Road","Gurgaon",122001);
		
		Doctor doc=new Doctor(109,"Suhana",762899,add1,add2);
				
		//Integer key = (Integer)dao.add(doc);
		
		System.out.println(dao.find(109));
		
		
		
		
		
		
	}
}
