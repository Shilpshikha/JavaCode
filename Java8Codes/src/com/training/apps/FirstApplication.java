package com.training.apps;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.training.ifaces.Greeting;

public class FirstApplication {

	public static void main(String[] args) {
		
		Greeting gre =()->{System.out.println("Hello People");};
		gre.show();
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rahul");
		names.add("Raj");
		names.add("Aman");
		names.add("Ram");
		
		//names.forEach(System.out::println);
		
		Consumer<String> style = (String s) -> {System.out.println(s);};
		names.forEach(style);
	}

}
