package com.training.hierarchy;

public class DVD extends MediaTypes{
	
	
	//private String author;
	//private String isbn;
	private double runTime;

	public DVD(String title, int volNum, int rating, int lendingLength,double runTime) {
		super(title,volNum,rating,lendingLength);
		this.runTime = runTime;
	}

	@Override
	public String toString() {
		return "DVD : \nrunTime = " + runTime + ", \ntitle = " + title + ", \nvolNum = " + volNum + ", \nrating = " + rating
				+ ", \nlendingLength = " + lendingLength ;
	}

	

}
