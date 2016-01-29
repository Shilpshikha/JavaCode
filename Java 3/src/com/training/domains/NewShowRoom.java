package com.training.domains;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	public NewShowRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Automobile getItem(int key){
		
		if(key==4){
			return new SportsBike();
		}
		else return super.getItem(key);
	}

}
