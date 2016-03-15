package com.training.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.training.daos.ServiceDaoImpl;
import com.training.domains.Customer;
import com.training.domains.Product;
import com.training.domains.ServiceRequest;

public class ServiceRowMapper implements RowMapper<ServiceRequest> {

	@Override
	public ServiceRequest mapRow(ResultSet rs, int rowCount) throws SQLException {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		ServiceDaoImpl dao = ctx.getBean("dao",ServiceDaoImpl.class);
		
		Customer cust = dao.find1(rs.getInt("CUSTOMER"));
		Product prod = dao.find2(rs.getInt("PRODUCT"));
		
		ServiceRequest req = new ServiceRequest();
		req.setRequestId(rs.getInt("requestId"));
		req.setDescr(rs.getString("descr"));
		req.setCustomer(cust);
		req.setProduct(prod);
		
		return req;
	}

}
