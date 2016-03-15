package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.domains.Customer;
import com.training.domains.Product;
import com.training.domains.ServiceRequest;
import com.training.ifaces.MyDao;
import com.training.utils.ServiceRowMapper;

public class ServiceDaoImpl extends JdbcDaoSupport implements MyDao<ServiceRequest> {

	@Override
	public boolean add(ServiceRequest t) {
		
		boolean result = false;
		String sql = "INSERT INTO SERVICEREQUEST VALUES(?,?,?,?)";
		String sql1 = "INSERT INTO CUSTOMER1 VALUES(?,?,?)";
		String sql2 = "INSERT INTO PRODUCT VALUES(?,?)";
		int rowAdded = getJdbcTemplate().update(sql,t.getRequestId(),t.getDescr(),t.getCustomer().getCustId(),t.getProduct().getProdId());
		int rowAdded2 = getJdbcTemplate().update(sql1,t.getCustomer().getCustId(),t.getCustomer().getCustName(),t.getCustomer().getHandPhone());
		int rowAdded3 = getJdbcTemplate().update(sql2,t.getProduct().getProdId(),t.getProduct().getProdName());
		if(rowAdded>0&&rowAdded2>0&&rowAdded3>0){
			result=true;
		}
		
		return result;
	}

	@Override
	public ServiceRequest find(int key) {

		String sql = "SELECT * FROM SERVICEREQUEST WHERE REQUESTID =?";
		ServiceRequest req = getJdbcTemplate().queryForObject(sql, new ServiceRowMapper(),key);
		
		return req;
	}

	@Override
	public List<ServiceRequest> findAll() {
		
		String sql = "SELECT * FROM SERVICEREQUEST";
		List<ServiceRequest> lst = getJdbcTemplate().query(sql, new ServiceRowMapper());
		
		return lst;
	}
	
	public Customer find1(int key){
		
		String sql = "SELECT * FROM CUSTOMER1 WHERE CUSTID =?";
		Customer cust = getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class),key);
		return cust;
	}
	
	public Product find2(int key){
		
		String sql = "SELECT * FROM PRODUCT WHERE PRODID =?";
		Product prod = getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Product>(Product.class),key);
		return prod;
	}

}
