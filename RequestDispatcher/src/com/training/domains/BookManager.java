package com.training.domains;
import java.util.*;

import com.training.entity.Book;

public class BookManager {

	private HashMap<Long,Book> bookList;
	Book bk,bk1,bk2 ;
	
	public BookManager(){
		
		bookList = new HashMap<Long,Book>();
		bk = new Book(1223, "Complete Reference", "schildt", 450.00);
		bk1 = new Book(1224, "Head First Java", "Kathy pierce", 650.00);
		bk2 = new Book(1225, "Thinking in java", "goseling", 670.00);
		
		bookList.put((long) 1223, bk);
		bookList.put((long) 1224, bk1);
		bookList.put((long) 1225, bk2);
		
	}
	
	public HashMap<Long,Book> getAllBooks(){
		return bookList;
	}
	
	public Book finBookById(long id){
	
		return bookList.get(id);
	}
}
