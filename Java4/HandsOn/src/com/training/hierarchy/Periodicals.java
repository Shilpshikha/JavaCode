package com.training.hierarchy;

public class Periodicals extends MediaTypes {

	public Periodicals(String title, int volNum, int rating, int lendingLength) {
		super(title,volNum,rating,lendingLength);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Periodicals : \ntitle = " + title + ", \nvolNum = " + volNum + ", \nrating = " + rating + ", \nlendingLength = "
				+ lendingLength ;
	}
	
	
}
