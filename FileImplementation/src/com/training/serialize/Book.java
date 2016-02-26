package com.training.serialize;

import java.io.Serializable;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 21L;
	private int bookNum;
	private String bookName;
	private String author;
	boolean available;
	//private transient double price;
	
	private double price;
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Book() {
		super();
		System.out.println("Book Initialized");
	}

	public Book(int bookNum, String bookName, String author, double price) {
		super();
		//System.out.println("Book Initialized");
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		
		return bookNum + " : " + bookName + " : " + author + " : " + price;
	}
	
		

}
