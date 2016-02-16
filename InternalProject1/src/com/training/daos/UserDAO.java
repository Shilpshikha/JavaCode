package com.training.daos;

import java.util.List;
import java.sql.*;

import com.training.entities.UserLogin;
import com.training.ifaces.DataAcessObject;
import com.training.utils.SqlConnection;

public class UserDAO implements DataAcessObject<UserLogin> {

	Connection con = null;
	
	public UserDAO() throws ClassNotFoundException {
		con = SqlConnection.getConnection();
	}

	@Override
	public int add(UserLogin t) {
		
		String sql = "INSERT INTO RES_USERS VALUES(?,?,?,?)";
		int rowAdded = 0;
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(2, t.getUsername());
			pstmt.setString(1, t.getEmpid());
			pstmt.setString(3,t.getPassword());
			pstmt.setString(4,t.getRole());
			rowAdded = pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rowAdded;
	}

	@Override
	public UserLogin find(String key) {
		
		return null;
	}

	@Override
	public List<UserLogin> findAll() {
		
		return null;
	}

	@Override
	public int update(String key) {
	
		return 0;
	}

	@Override
	public int delete(String key) {
		
		return 0;
	}
	
	public boolean isCorrect(String uname, String passwd, String role){
		
		boolean flag = false;
		String sql = "SELECT * FROM RES_USERS WHERE USERNAME = ? AND PASSWORD = ? AND ROLE = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, uname);
			pstmt.setString(2, passwd);
			pstmt.setString(3, role);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				flag=true;
			}
		
			if(flag==true) {
				System.out.println("Login successful");
			}
			else {
				System.out.println("Incorrect username/password/role");
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	

}
