package com.training.hierarchy;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
	
		MediaTypes m[] = new MediaTypes[3];
		m[0] = new Books("Complete Reference",3,5,7,"Schildt","A987-110-123653");
		m[1] = new Periodicals("Forbes",99,5,7);
		m[2] = new DVD("Linkin Park",44,5,7,30.4);
		String mntype;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter media type : ");
		mntype = in.next();
		
		if(mntype.equals("books")){
			System.out.println(m[0]);
		}
		else if(mntype.equals("periodicals")){
			System.out.println(m[1]);
		}
		else if(mntype.equals("dvd")){
			System.out.println(m[2]);
		}
		else
			System.out.println("Wrong input");
		
		in.close();
	}

}
