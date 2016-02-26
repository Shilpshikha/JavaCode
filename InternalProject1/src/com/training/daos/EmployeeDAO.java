package com.training.daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.training.entities.Employees;
import com.training.ifaces.DataAcessObject;
import com.training.utils.SqlConnection;

public class EmployeeDAO implements DataAcessObject<Employees> {

	private Connection con;
	
	public EmployeeDAO() throws ClassNotFoundException {
		
		con = SqlConnection.getConnection();
	}

	@Override
	public int add(Employees t) {
	
		String sql = "INSERT INTO RES_EMPLOYEE VALUES(?,?,?,?,?,?,?)";
		int rowAdded=0;
		
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getEmpid());
			pstmt.setString(2, t.getName());
			pstmt.setString(3,t.getDate_of_birth());
			pstmt.setString(4, t.getDate_of_join());
			pstmt.setLong(5, t.getPhone());
			pstmt.setString(6, t.getAddress());
			pstmt.setDouble(7, t.getSalary());

			rowAdded = pstmt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public Employees find(String e_id) {

		String sql = "SELECT * FROM RES_EMPLOYEE WHERE EMP_ID = ?";
		Employees emp = null;
		try{
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, e_id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				emp = getEmployee(rs);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employees> findAll() {
		
		ArrayList<Employees> alist = new ArrayList<Employees>();
		String sql = "SELECT * FROM RES_EMPLOYEE";
		try{
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Employees emp = getEmployee(rs);
				alist.add(emp);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return alist;
	}

	@Override
	public int update(String empid) {
		
		return 0;
	}

	@Override
	public int delete(String empid) {
	
		String sql = "DELETE FROM RES_EMPLOYEE WHERE EMP_ID = ?";
		int rowDeleted = 0;
		try{
			PreparedStatement pstmt =con.prepareStatement(sql);
			pstmt.setString(1, empid);
			rowDeleted = pstmt.executeUpdate();
		
		}catch(SQLException e){
			
			e.printStackTrace();
		}
		return rowDeleted;
	}
	
	public Employees getEmployee(ResultSet rs){
		
		Employees emp = null;
		try{
			
			emp = new Employees(rs.getString("EMP_ID"),rs.getString("EMP_NAME"),rs.getString("EMP_DOB"),rs.getString("EMP_DOJ"),rs.getLong("EMP_PHONE"),rs.getString("EMP_ADDR"),rs.getDouble("EMP_SALARY"));
				
		}catch(SQLException e){
			
			e.printStackTrace();
		}
		return emp;
	}

}
