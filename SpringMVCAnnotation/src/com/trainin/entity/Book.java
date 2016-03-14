package com.trainin.entity;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	
	private long bookNumber;
	private String bookName;
	private String subject;
	private Isbn code;

	Logger log = Logger.getLogger(this.getClass().getName());
	
	public Book() {
		super();
		log.info("Book Initializd");
	}

	public long getBookNumber() {
		log.info("Get bookNumber called");
		return bookNumber;
		
	}

	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
		log.info("Set bookNumber called");
	}

	public String getBookName() {
		log.info("Get bookName called");
		return bookName;
	
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
		log.info("Set bookName called");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	

	public Isbn getCode() {
		return code;
	}

	public void setCode(Isbn code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", subject=" + subject + ", code=" + code
				+ "]";
	}



	
	

}
