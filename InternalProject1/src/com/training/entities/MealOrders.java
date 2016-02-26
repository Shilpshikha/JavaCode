package com.training.entities;

import java.sql.Timestamp;
import java.util.List;

public class MealOrders {

	
	private int orderno;
	private String waiterid;
	private int tableno;
	private int qty;
	private Timestamp timestmp;
	private boolean prepared;
	
	List<String> itemname;
	
	public MealOrders(int orderno, String waiterid, int tableno, int qty,List<String> itemname, Timestamp timestmp, boolean prepared) {
		super();
		this.orderno = orderno;
		this.waiterid = waiterid;
		this.tableno = tableno;
		this.qty = qty;
		this.itemname = itemname;
		this.timestmp = timestmp;
		this.prepared = prepared;
	}

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	public String getWaiterid() {
		return waiterid;
	}

	public void setWaiterid(String waiterid) {
		this.waiterid = waiterid;
	}

	public int getTableno() {
		return tableno;
	}

	public void setTableno(int tableno) {
		this.tableno = tableno;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	public List<String> getItems() {
		return itemname;
	}

	public void setItems(List<String> items) {
		this.itemname = itemname;
	}

	public Timestamp getTimestmp() {
		return timestmp;
	}

	public void setTimestmp(Timestamp timestmp) {
		this.timestmp = timestmp;
	}

	public boolean isPrepared() {
		return prepared;
	}

	public void setPrepared(boolean prepared) {
		this.prepared = prepared;
	}

	public List<String> getItemname() {
		return itemname;
	}

	public void setItemname(List<String> itemname) {
		this.itemname = itemname;
	}

	@Override
	public String toString() {
		return "MealOrders [orderno=" + orderno + ", waiterid=" + waiterid + ", tableno=" + tableno + ", qty=" + qty
				+ ", timestmp=" + timestmp + ", prepared=" + prepared + ", itemname=" + itemname + "]";
	}

	


	
	
	
	
}
