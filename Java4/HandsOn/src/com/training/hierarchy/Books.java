package com.training.hierarchy;

public class Books extends MediaTypes {
	

	private String author;
	private String isbn;
	//private double runTime;
	
	public Books(String title, int volNum, int rating, int lendingLength,String author, String isbn) {
		super(title,volNum,rating,lendingLength);
		this.author = author;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Books : \nauthor = " + author + ", \nisbn = " + isbn + ", \ntitle = " + title + ", \nvolNum = " + volNum + ", \nrating = "
				+ rating + ", \nlendingLength = " + lendingLength ;
	}
	
	

}

