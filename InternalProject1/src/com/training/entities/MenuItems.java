package com.training.entities;
import java.sql.*;

import com.training.utils.SqlConnection;
public class MenuItems {

	private int itemId;
	private String itemName;
	private double price;
	private String category;
	private boolean availability;
	Connection con;
	
	public MenuItems(int itemId, String itemName, double price, String category, boolean avail) throws ClassNotFoundException {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.category = category;
		this.availability = avail;
		con = SqlConnection.getConnection();
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "MenuItems [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", category=" + category
				+ "]";
	}
//	
//	public boolean checkAvailability(int itemid){
//		String sql = "SELECT IS_AVAIALBLE FROM RES_MENUITEM WHERE ITEM_ID = ?";
//		String avail;
//		try{
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()){
//			 avail = rs.getString("IS_AVAILABLE");
//		}
//		return false;
//	}

	
}
