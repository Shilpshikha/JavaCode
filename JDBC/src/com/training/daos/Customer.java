package com.training.daos;
import java.sql.Date;
public class Customer {
	
	private int cusid;
	private String cusname;
	private long phone;
	private String email;
	private String dob;
	private long landlineno;
	private Date dt;
	
	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Customer(int cusid, String cusname, long phone, String email, String dob, long landlineno) {
		super();
		this.cusid = cusid;
		this.cusname = cusname;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
		this.landlineno = landlineno;
	}

	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getLandlineno() {
		return landlineno;
	}

	public void setLandlineno(long landlineno) {
		this.landlineno = landlineno;
	}

	@Override
	public String toString() {
		return "\n\nCustomer : \ncusid = " + cusid + ", \ncusname = " + cusname + ", \nphone = " + phone + ", \nemail = " + email + ", \ndob = "
				+ dob + ", \nlandlineno = " + landlineno;
	}

	
	
	

}
