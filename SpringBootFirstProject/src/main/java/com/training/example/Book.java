package com.training.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Book {

	@Value("10098898")
	private long bookNumber;
	
	@Value("Head First java")
	private String bookName;
	
//	@Value("Kathy pierce")
//	private String author;
	
	@Autowired
	private Author author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(long bookNumber, String bookName, Author author) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
	}

	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	
}
