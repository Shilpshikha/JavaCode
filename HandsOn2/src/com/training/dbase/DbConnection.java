package com.training.dbase;

import java.sql.*;
public class DbConnection {

	public static Connection getOracleConnection(){
		Connection con = null;
		try{
			
			String cls = "oracle.jdbc.driver.OracleDriver";
			Class.forName(cls);
			String url = "jdbc:oracle:thin:system/Firstj0b@localhost:1521/xe";
			con = DriverManager.getConnection(url);
			
		
	
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return con;
	}
}
