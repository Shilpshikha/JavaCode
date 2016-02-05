package com.java.apps;

import java.util.Calendar;
import java.sql.Date;
import com.java.utils.SqlConnection;
import com.training.daos.Customer;
import com.training.daos.CustomerDAO;

public class Application {

	public static void main(String[] args) {
		
		//System.out.println(SqlConnection.getOracleConnection());

		Customer cust = new Customer(901,"Shalini",7884332,"sha@abc.com","24-MAY-94",432664);
		CustomerDAO dao =new CustomerDAO();
		//int rowAdded = dao.add(cust);
		
		//System.out.println(dao.find(1));
		//System.out.println(dao.delete(6) + " row deleted");
		System.out.println(dao.update(1) + " row updated");
		System.out.println(dao.findAll());
		
//		Calendar c = Calendar.getInstance();
//		c.set(1995, 06, 9);
//		
//		Date d =new Date(c.getTimeInMillis());
//		cust.setDt(d);
		//System.out.println(rowAdded + ":=Rows Added");
	}

}
