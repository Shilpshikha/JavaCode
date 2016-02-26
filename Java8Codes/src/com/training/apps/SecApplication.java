package com.training.apps;

import com.training.ifaces.Convert;

public class SecApplication {

	public static void main(String[] args) {
	
		Convert con = (double d)->{return (d+10.0);};
		System.out.println(con.calculate(30.0));

	}

}
