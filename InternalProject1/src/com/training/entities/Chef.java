package com.training.entities;

import java.sql.*;
import java.util.*;

import com.training.utils.SqlConnection;
public class Chef {

	private String chefid;
	Connection con;
	
	public Chef(String chefid) throws ClassNotFoundException{
		this.chefid = chefid;
		con = SqlConnection.getConnection();
	}
	
	
	public String getChefid() {
		return chefid;
	}

	public void setChefid(String chefid) {
		this.chefid = chefid;
	}


	public void getOrders(){
		String sql = "SELECT * FROM RES_ORDERS WHERE ORDER_TIME > SYSDATE-INTERVAL '60' MINUTE";
		MealOrders order=null;
		ArrayList<String> lst = new ArrayList<String>();
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				String item = rs.getString("ITEMS");
				lst.add(item);
				order = new MealOrders(rs.getInt("ORDER_NO"), rs.getString("EMP_ID"), rs.getInt("TABLE_NO"), rs.getInt("QTY"), lst,rs.getTimestamp("ORDER_TIME"),Boolean.valueOf(rs.getString("IS_PREPARED")));
				System.out.println(order);
				lst.remove(item);
				}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public int orderPrepare(int orderno){
		boolean prepared = true;
		String sql = "UPDATE RES_ORDERS SET IS_PREPARED = ? WHERE ORDER_NO = ? ";
		int prepareUpdate = 0;
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setBoolean(1, prepared);
			pstmt.setInt(2, orderno);
			prepareUpdate = pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return prepareUpdate;
	}
	
	
}
