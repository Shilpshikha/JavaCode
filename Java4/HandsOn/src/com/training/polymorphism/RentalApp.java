package com.training.polymorphism;

import java.util.Scanner;

public class RentalApp {
	
	public static void printDetails(Items item)
	{
		item.getDetails(item.getSerialNum());
		System.out.println("\nRent at 50% rate :  "  + item.getRent(item.getRate(),item.getDays()));
	}

	public static void main(String[] args) {
		
		int days;
		int itemNo;
	
		
		Scanner in = new Scanner(System.in);
		
		
		do{
			System.out.println("\nEnter 0 to exit");
			System.out.println("Select items : ");
			System.out.println("1.Fan");
			System.out.println("2.Vessel");
			System.out.println("3.AirConditioner");
			itemNo = in.nextInt();
			if(itemNo>0){
			System.out.println("\nEnter no. of days");
			days = in.nextInt();
			switch(itemNo){
			case 1 :
				{
					Items i = new Fan(itemNo,670.00,days,"Orion","Table fan");
					printDetails(i);
				}
				break;
			case 2:
				{
					Items i = new Vessels(itemNo,450.00,days,"Bone China","small"); 
					printDetails(i);
				}
			break;
			default:
				System.out.println("\nWrong input");
				break;
			}
			}	
		}while(itemNo>0);
	System.out.println("out of stock!!");
	in.close();
	}
	
}
