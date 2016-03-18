package com.training.app;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.domains.Address;
import com.training.entity.ClinicalAssistant;
import com.training.entity.Doctor;
import com.training.entity.InPatient;
import com.training.entity.Patient;
import com.training.utils.HiberUtils;

public class One2OneApplication {

	public static void main(String[] args) {
	
		SessionFactory factory = HiberUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		
		Address add1 = new Address("HEC","Ranchi",834001);
		Address add2 = new Address("MG Road","Gurgaon",122001);
		
		ClinicalAssistant assist  = new ClinicalAssistant(902,"Tarun");
		Doctor doc=new Doctor(108,"Suhas",5667634,add1,add2,assist);
		
		Timestamp date = new Timestamp(new Date().getTime());
		
		InPatient pat1 = new InPatient(601,"Jack",434223,12,date);
		InPatient pat2  = new InPatient(602,"Lily",894342,13,date);
		InPatient pat3  = new InPatient(603,"Karan",765426,14,date);
		
		Set<Patient> list = new HashSet<Patient>();
		
		list.add(pat1);
		list.add(pat2);
		list.add(pat3);
		
		doc.setPatientList(list);
		
		//session.save(doc);
		tx.commit();
		
		Doctor doc1 = (Doctor)session.get(Doctor.class, 104);
		System.out.println(doc1);
		System.out.println(doc.getPatientList());
		factory.close();

	}

}
