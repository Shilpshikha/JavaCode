package com.training.domains;

import com.training.ifaces.Automobile;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewShowRoom showroom = new NewShowRoom();
		Automobile polyAuto = null;
		int key;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter key : ");
		key= in.nextInt();
		polyAuto = showroom.getItem(key);
		if(polyAuto!=null)
			showroom.printQuote(polyAuto);
		else
			System.out.println("Invalid Option");
		in.close();

	}

}
