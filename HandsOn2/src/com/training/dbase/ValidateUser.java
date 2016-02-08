package com.training.dbase;
import java.sql.*;
public class ValidateUser {
	
	Connection con;
	
	public ValidateUser() {
		con = DbConnection.getOracleConnection();
	}

	public boolean validate(User u){
		
		boolean b =false;
		String sql = "Select * from SAPIENTUSER WHERE USERNAME = ? AND PASSWORD = ?" ;
		try
		{	
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getUserName());
			pst.setString(2, u.getPassWord());
			ResultSet rs = pst.executeQuery();
			b= rs.next();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return b;
	}
}
