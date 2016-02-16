package com.training.entities;

import java.sql.*;
import java.util.List;
import java.util.Date;

import com.training.utils.SqlConnection;

public class Waiter {
	
	Date date = new Date();
	private Timestamp stmp;
	private int tableno;
	private String waiterid;

	MealOrders orders;
	MenuItems menu;
	Connection con;

	public Waiter(int tableno, String waiterid) throws ClassNotFoundException {
		this.tableno = tableno;
		this.waiterid = waiterid;
		orders = null; 
		stmp = new Timestamp(date.getTime());
		con = SqlConnection.getConnection();
	}

	public int getTableno() {
		return tableno;
	}

	public void setTableno(int tableno) {
		this.tableno = tableno;
	}
	
	
	public String getWaiterid() {
		return waiterid;
	}

	public void setWaiterid(String waiterid) {
		this.waiterid = waiterid;
	}

	public MealOrders placeOrder(int orderno, List<String> itemname, int qty){
		boolean notprepared = false;
	
		
		orders = new MealOrders(orderno, waiterid, tableno, qty, itemname,stmp,notprepared); 
		String sql = "INSERT INTO RES_ORDERS VALUES(?,?,?,?,?,?,?)";
		int orderPlaced;
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, orderno);
			pstmt.setString(2, waiterid);
			pstmt.setInt(3, tableno);
			pstmt.setInt(4, qty);
			pstmt.setString(5, itemname.toString());
			pstmt.setTimestamp(6, stmp);
			pstmt.setBoolean(7, notprepared);
			orderPlaced = pstmt.executeUpdate();
			System.out.println("Orders placed : " + orderPlaced);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return orders;
	}
	

	
	
	
		
	}


