package com.training.dbase;

public class CheckUser {

	public static void main(String[] args) {
	
		ValidateUser v = new ValidateUser();
		//System.out.println(v.validate(new User("saloni","s12","trainee")));
		
		if(v.validate(new User("saloni","s13","trainee"))==true){
			System.out.println("User exists");
		}
		else System.out.println("Wrong username/password");
	}

}
