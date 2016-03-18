package com.training.apps;


import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.InPatient;
import com.training.entity.Patient;
import com.training.utils.HiberUtils;

public class Application {

	public static void main(String args[]){
		
		SessionFactory factory = HiberUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		
		Timestamp date = new Timestamp(new Date().getTime());
		
		InPatient patient = new InPatient(102,"Sharda",4593459,201,date);
		
		Patient patient1 = (Patient)session.get(Patient.class, 101);
		session.save(patient);
		tx.commit();
		System.out.println(patient1.calculate());
		
	}
}
