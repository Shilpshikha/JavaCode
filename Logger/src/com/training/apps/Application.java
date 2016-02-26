package com.training.apps;

import com.training.domains.Restaurant;

public class Application {

	public static void main(String[] args) {
	
		Restaurant rt = new Restaurant();
		rt.init();
		//System.out.println(rt.getMenu());
		System.out.println(rt.getItems("Jeera Rice"));

	}

}
