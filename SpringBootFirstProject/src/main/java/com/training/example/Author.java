package com.training.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author {

	@Value("1009212")
	private long authorNum;
	
	@Value("Kathy pierce")
	private String authorName;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(long authorNum, String authorName) {
		super();
		this.authorNum = authorNum;
		this.authorName = authorName;
	}

	public long getAuthorNum() {
		return authorNum;
	}

	public void setAuthorNum(long authorNum) {
		this.authorNum = authorNum;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Author [authorNum=" + authorNum + ", authorName=" + authorName + "]";
	}
	
	
}
