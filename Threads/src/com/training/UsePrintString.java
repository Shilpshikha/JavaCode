package com.training;

public class UsePrintString implements Runnable {

	private String str1;
	private String str2;
	
	public UsePrintString(String str1,String str2) {
		super();
		// TODO Auto-generated constructor stub
		this.str1 = str1;
		this.str2 = str2;
		
		Thread t =new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		PrintString.print(str1, str2);

	}

}
