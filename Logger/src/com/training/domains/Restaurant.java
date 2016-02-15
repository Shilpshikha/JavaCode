package com.training.domains;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Restaurant {

	private List<FoodItems> items;
	FoodItems f1,f2,f3,f4,f5;
	
	Logger log = Logger.getRootLogger();
	//BasicConfigurator.configure();
	
	public Restaurant(){
		items = new ArrayList<FoodItems>();
		f1 = new FoodItems(101,"Jeera Rice",200.00,true);
		f2 = new FoodItems(102,"Fried Rice",300.00,true);
		f3 = new FoodItems(103,"Veg Biryani",350.00,true);
		f4 = new FoodItems(104,"Chicken Biryani",400.00,false);
		f5 = new FoodItems(105,"Chicken fried rice",360.00,false);
		log.info("Food Item initialized");
	}
	
	public void init(){
	 
		items.add(f1);
		items.add(f2);
		items.add(f3);
		items.add(f4);
		items.add(f5);	
		
		log.info("Food item added to menu card");
		
	}
	
	public List<FoodItems> getItems(String food){
	
		for(FoodItems fditm : items){
			
			if(fditm.isVeg()==true){
				System.out.println("Veg food : ");
				System.out.println(fditm);
				//return items;
			}
			else {
				System.out.println("Non veg food : ");
				System.out.println(fditm);
				//return items;
			}
		}
			
   return items;
	}
	
	public List<FoodItems> getMenu(){
		
		return items;
	}
}
