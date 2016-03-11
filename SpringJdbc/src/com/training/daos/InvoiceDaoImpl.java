package com.training.daos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Invoice;
import com.training.ifaces.MyDAO;
import com.training.utils.InvoiceRowMapper;

public class InvoiceDaoImpl extends JdbcDaoSupport implements MyDAO<Invoice> {

	

	@Override
	public boolean add(Invoice t) {
	
		boolean result = false;
		String sql = "INSERT INTO INVOICE VALUES (?,?,?)";
		int rowInserted = getJdbcTemplate().update(sql,t.getInvoiceNumber(),t.getCustomerName(),t.getAmount());
		
		if(rowInserted>0){
			result = true;
		}
		
		return result;
	}

	@Override
	public Invoice find(int key) {

		Invoice t =null;
		String sql = "SELECT * FROM INVOICE WHERE INVOICENUMBER=?";
		//t = getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Invoice>(Invoice.class),key);
		t = getJdbcTemplate().queryForObject(sql, new InvoiceRowMapper(),key);
		return t;
	}

	@Override
	public List<Invoice> findAll() {
	
		List<Invoice> lst;
		String sql = "SELECT * FROM INVOICE";
		lst = getJdbcTemplate().query(sql, new InvoiceRowMapper());
		return lst;
	}


}
