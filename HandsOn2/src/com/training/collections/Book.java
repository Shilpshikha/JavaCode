package com.training.collections;

public class Book {

	private String bookname;
	private String bookid;
	
	public Book(String bookname, String bookid) {
		super();
		this.bookname = bookname;
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	@Override
	public String toString() {
		return "\n\nBook \nbookname = " + bookname + ", \nbookid = " + bookid;
	}
	
	
	
 }
