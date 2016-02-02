package com.training;

import java.io.IOException;

public class JoinExample {

	public static void main(String[] args) {
		
		Thread t = new Thread(){

			@Override
			public void run() {
				System.out.println("Reading");
				
				try {
					System.in.read();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		
		};
		t.start();
	System.out.println("Starting");
		try {
			t.join();
			System.out.println("Finished Reading");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	System.out.println("Main Finished");
	}

}
