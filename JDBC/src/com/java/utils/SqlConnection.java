package com.java.utils;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

import oracle.jdbc.driver.DBConversion;

public class SqlConnection {

	public static Connection getOracleConnection(){
		
		Connection con = null;
		
		try {
			//Load the property file
			Properties props = new Properties();
			FileInputStream inps = new FileInputStream(new File("DbConnection.properties"));
			props.load(inps);
			
			//Establish connection
			Class.forName(props.getProperty("db.className"));
			con=DriverManager.getConnection(props.getProperty("db.url"), 
											props.getProperty("db.userName"),
											props.getProperty("db.passWord")
											);
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
