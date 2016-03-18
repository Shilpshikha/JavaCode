package com.training.apps;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.training.daos.DoctorDAO;
import com.training.domains.Address;
import com.training.entity.Doctor;

public class FirstApplication {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		Doctor doc = new Doctor(103,"Sunil",78564364);
//		Integer key = (Integer)session.save(doc);
//		System.out.println(key);
		
//		Doctor doc2 = (Doctor)session.get(Doctor.class,101);
//		System.out.println(doc2);
		
//		
//		Address add1 = new Address("Ratu Road","Ranchi",834001);
//		Address add2 = new Address("Sector 22","Gurgaon",122001);
//		Doctor doc=new Doctor(104,"Harsh",454234,add1,add2);
////		doc.setClinicAddr(add2);
////		doc.setHomeAddr(add1);
//		System.out.println(doc);
//		session.save(doc);
		
		Doctor doc = new Doctor(105,"Sweta",23232434,new Address("21,MG road","Delhi",110092),new Address("33,SS road","Delhi",110021));
		doc.setDoctorName("Sunita");
		
		DoctorDAO dao = new DoctorDAO();
		//System.out.println(dao.add(doc));
		System.out.println(dao.find(new Integer(102)));
		System.out.println(dao.findAll());
		System.out.println(dao.update(doc));
		System.out.println(dao.delete(100));
		tx.commit();
		factory.close();

	}

}
