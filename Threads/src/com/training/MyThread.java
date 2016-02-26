package com.training;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for(int i =0;i<5;i++){
			System.out.println("Testing thread!");
		}
	//	System.out.println(Thread.currentThread().getName());
	}
	
	

}
