package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.classic.Session;

import com.training.entity.Doctor;
import com.training.ifaces.MyDAO;
import com.training.utils.HiberUtils;

public class DoctorDAO implements MyDAO<Doctor> {

	SessionFactory factory;

	public DoctorDAO() {
		super();
		factory = HiberUtils.getSessionFactory();
	}

	@Override
	public Object add(Doctor t) {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Integer key = (Integer)session.save(t);
		tx.commit();
		return key;
	}

	@Override
	public Doctor find(Serializable obj) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Doctor doc = (Doctor)session.get(Doctor.class, (Integer)obj);
		tx.commit();
		return doc;
	}

	@Override
	public List<Doctor> findAll() {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<Doctor> docList=session.createQuery("from Doctor").list();
		tx.commit();
		return docList;
	}

	@Override
	public Doctor update(Doctor obj) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		return obj;
	}

	@Override
	public boolean delete(Serializable obj) {
		boolean result=true;
		try{
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			Doctor doc= (Doctor)session.load(Doctor.class,obj);
			session.delete(doc);
			tx.commit();
		}
		catch(HibernateException e){
			e.printStackTrace();
			result=false;
		}
			return result;
	}

}
