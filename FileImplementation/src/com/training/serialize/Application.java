package com.training.serialize;

public class Application {

	public static void main(String[] args) {
		
		Book b = new Book(12,"Complete Reference", "Schildt",450.00);
		//Book b1 = new Book();
		//Multiple objects through array, list, collections
		
		BookSerializer bs = new BookSerializer();
		String message;
		
		//System.out.println(bs.serialize(b));
		//System.out.println(bs.deSerialize());
		
		//System.out.println(bs1.deSerialize());
		//System.out.println(bs.serialize(b1));
		
		message = bs.serialize(b);
		if(message!=null){
			System.out.println(message);
		}
		else System.out.println("Check code");
		
		/**
		 * default constructor is not called dureing deserialization
		 */
		Book bk = (Book)bs.deSerialize();
		System.out.println(bk);
		
		System.out.println(bk.getPrice());

	}

}
