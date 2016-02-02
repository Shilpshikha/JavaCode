package com.training;

public class YourThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<3;i++){
			System.out.println(calculate());
		}
			
	}
	static double i=100;
	//static final
	public double calculate(){
		//double i=100;
		return i++;
	}

}
