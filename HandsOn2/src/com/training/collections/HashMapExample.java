
/**
 * 			HashMap<Manager,List<Employees>>;
 * 			HashMap<Subject,List<Books>>;
 */
package com.training.collections;

import java.util.*;
public class HashMapExample {
	
	private HashMap<String,List<Book>> conv;
	Book b1, b2, b3, b4;

	public HashMapExample() {
		conv = new HashMap<String,List<Book>>();
	}
	
	public void init(){
		b1 = new Book("Schildt","CS");
		b2 = new Book("Thinking in Java", "CS");
		b3 = new Book("Head First Java", "CS");
		b4 = new Book("Wren n Martin","ENG");
		
		ArrayList<Book> abkl= new ArrayList<Book>();
		abkl.add(b1);
		abkl.add(b2);
		abkl.add(b3);
		
		
		ArrayList<Book> abkl2= new ArrayList<Book>();
		abkl2.add(b4);
		
		conv.put("CS", abkl);
		conv.put("ENG", abkl2);
	}
	
	public List<Book> findBook(String key){
		return conv.get(key);
	}
	
	

}
