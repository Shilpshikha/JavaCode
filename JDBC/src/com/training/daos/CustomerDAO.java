package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.java.utils.SqlConnection;
//import com.training.entity.Customer;
import com.training.ifaces.DataAccessObject;

public class CustomerDAO implements DataAccessObject<Customer> {

	
	private Connection con;
	
	
	
	public CustomerDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	@Override
	public int add(Customer t) {
		
		String sql = "Insert into customer values(?,?,?,?,?,?)";
		int rowAdded = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getCusid());
			pstmt.setString(2, t.getCusname());
			pstmt.setLong(3, t.getPhone());
			pstmt.setString(4, t.getEmail());
			pstmt.setString(5, t.getDob());
			pstmt.setLong(6, t.getLandlineno());
			
			rowAdded= pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rowAdded;
	}

	@Override
	public Customer find(int cid) {
		
		Customer cust = null;
		String qur = "Select * from Customer where CUSTOMER_ID = ?";
		try {
			PreparedStatement pst = con.prepareStatement(qur);
			pst.setInt(1, cid);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
//				System.out.println("Id : " + rs.getInt(cid) +
//									"Name : " + rs.getString("CUSTOMER_NAME") +
//									"phone : " + rs.getLong("PHONE") +
//									"Email : " + rs.getString("EMAIL") +
//									"DOB : " + rs.getString("DOB") + 
//									"Landline : " + rs.getLong("LANDLINE_NUMBER")
//									);
				
				//cust = new Customer(cid,rs.getString("CUSTOMER_NAME"),rs.getLong("PHONE"), rs.getString("EMAIL"),rs.getString("DOB"),rs.getLong("LANDLINE_NUMBER"));
				getCustomer(rs);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return cust;
	}

	
	private Customer getCustomer(ResultSet rs){
		
		Customer cust= null;

			try {
			
				cust = new Customer(rs.getInt("CUSTOMER_ID"),rs.getString("CUSTOMER_NAME"),rs.getLong("PHONE"), rs.getString("EMAIL"),rs.getString("DOB"),rs.getLong("LANDLINE_NUMBER"));
			
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
			return cust;
			
		
	}
	
	@Override
	public List<Customer> findAll() {
		
		ArrayList<Customer> cusList = new ArrayList<Customer>();
		String sql = "Select * from customer";
		//Customer cust=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Customer cust = getCustomer(rs);
				cusList.add(cust);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return cusList;
		
		//return cust;
	}

	@Override
	public int update(int key) {
	
		int rowUpdated=0;
		
		String qur = "Update Customer set PHONE=? where CUSTOMER_ID =?";
		try {
			PreparedStatement pst = con.prepareStatement(qur);
			pst.setLong(1, 78654);
			pst.setInt(2, key);
			rowUpdated = pst.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return rowUpdated;
	
	}

	@Override
	public int delete(int key) {
		//Customer cust = null;
		int rowDeleted=0;
		
		String qur = "Delete from Customer where CUSTOMER_ID =?";
		try {
			PreparedStatement pst = con.prepareStatement(qur);
			pst.setInt(1, key);
			rowDeleted = pst.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return rowDeleted;
	}
	
	//validate() on the basis of username and password

}
