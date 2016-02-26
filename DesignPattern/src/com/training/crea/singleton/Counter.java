package com.training.crea.singleton;

public class Counter {

	private static Counter count;
	private static int counter=0;
	private Counter(){}
	
	public synchronized static Counter getInstance(){
		
		if(count==null){
		
			count=new Counter();
			System.out.println(++counter);
		}
		else System.out.println(++counter);
		return count;
		
	}
}
