package com.training.utils;
import java.sql.*;
public class SqlConnection {

	public static Connection getConnection() throws ClassNotFoundException{
		
		Connection con = null;
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Firstj0b");
		
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return con;
	} 
}
