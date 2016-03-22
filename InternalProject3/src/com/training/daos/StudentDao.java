package com.training.daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Student;
import com.training.ifaces.MyDAO;

public class StudentDao extends HibernateDaoSupport implements MyDAO<Student> {

	@Override
	public Serializable add(Student t) {
		Serializable key = getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public List<Student> find(Serializable obj) {
		//Student stud = (Student)getHibernateTemplate().get(Student.class, obj);
		//List<Student> list  = (List<Student>)getHibernateTemplate().find("from Student where department = ? orderby grade desc ",obj);
		//return stud;
		List<Student> list  = (List<Student>)getHibernateTemplate().find("from Student where department=?",obj);
		 
		return list;
	}

	@Override
	public List<Student> findAll() {
		List<Student> list  = (List<Student>)getHibernateTemplate().find("from Student");
		return list;
	}

	@Override
	public Student update(Student obj) {
		
		getHibernateTemplate().update(obj);
		return obj;
	}

	@Override
	public boolean delete(Serializable obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public List<Student> getStudents(Serializable obj)  {
		Criteria ctr = getSession().createCriteria(Student.class);	
		 ctr.add(Restrictions.eq("department",obj));	
		 ctr.addOrder(Order.desc("grade"));
		 ctr.setMaxResults(3);
		 List<Student> studList = ctr.list();	
		 return studList;
    }

}
