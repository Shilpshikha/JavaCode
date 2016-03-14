package com.training.apps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Doctor;

public class SimpleApplication {

	public static void main(String [] args){
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		
		Doctor doc1 = ctx.getBean(Doctor.class);
		System.out.println(doc1);
		//System.out.println(doc1.Patient());
		
		Doctor doc2 = ctx.getBean("Dentist",Doctor.class);
		System.out.println(doc2);
		//System.out.println(doc2.getPatient());
		
		ctx.close();
		
	}
}