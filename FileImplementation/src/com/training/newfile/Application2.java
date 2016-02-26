package com.training.newfile;

import java.io.*;
import java.util.Scanner;

import com.training.serialize.Book;

public class Application2 {

	public static void main(String args[]){
	
		Book b = new Book(12,"Complete Reference", "Schildt",450.00);
		Book b1 = new Book(13,"Head First Java", "Kathy",950.00);
		Book b2 = new Book(14,"Harry Potter", "Rowling",350.00);
	
		Book[] b3 = {b,b1,b2};
		
	//	String fname;
		BookManager bm = new BookManager();
		bm.addBooks(b3);
//		System.out.println("Enter file name");
//		Scanner in = new Scanner(System.in);
//		fname = in.next();
		File fin = new File("Book.txt");
		bm.printBooks(fin);
	//in.close();
	
	}//addBooks()
}
