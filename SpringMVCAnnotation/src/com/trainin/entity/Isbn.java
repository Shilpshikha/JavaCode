package com.trainin.entity;

import org.springframework.stereotype.Component;

@Component
public class Isbn {
	
	private String intCode;
	private long bookCode;
	private String category;
	
	public Isbn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIntCode() {
		return intCode;
	}

	public void setIntCode(String intCode) {
		this.intCode = intCode;
	}

	public long getBookCode() {
		return bookCode;
	}

	public void setBookCode(long bookCode) {
		this.bookCode = bookCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Isbn [intCode=" + intCode + ", bookCode=" + bookCode + ", category=" + category + "]";
	}

	
	
	
	

}
