package com.training.example;
import java.sql.*;

public class CallableExample {

	public static void main(String[] args) {
	
		try{
			//Add external library, ojdbc.jar
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:system/Firstj0b@localhost:1521/XE";
			Connection con =DriverManager.getConnection(url);
			
			//Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Firstj0b");
			
			CallableStatement cstmt = con.prepareCall("call UPDATEPHONENO(?,?)");
			
			cstmt.setInt(1, 1);
			cstmt.setLong(2, 787878L);
			
			cstmt.execute();
			System.out.println("Phone no. updated");
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
