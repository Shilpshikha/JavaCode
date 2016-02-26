package com.training;

public class Application {

	public static void main(String args[]){
	
		System.out.println(Thread.currentThread().getName());
		Thread t = new MyThread();
	t.start();
	//System.out.println(Thread.currentThread().getName());
	t.setName("New Thread");
	}
}
