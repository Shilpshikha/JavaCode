/**
 * 2. Inheritance 

1. Design and build a class hierarchy for media types stored in a package. 
Hierarchy should support Books, Periodicals, and DVDs. 
a. Some attributes for these kinds of objects include: title, author, ISBN 
number, subject, running time, volume number, rating, and lending length. 
b. Store the hierarchy in a package and then write a program that creates an array of media types 
c. Write a program to print details of Selected Media Type, by taking the user input.
 */

package com.training.hierarchy;

public class MediaTypes {
	
	protected String title;
	protected int volNum;
	protected int rating;
	protected int lendingLength;
	
	public MediaTypes(String title, int volNum, int rating, int lendingLength) {
		super();
		this.title = title;
		this.volNum = volNum;
		this.rating = rating;
		this.lendingLength = lendingLength;
	}
	
	


	
}
