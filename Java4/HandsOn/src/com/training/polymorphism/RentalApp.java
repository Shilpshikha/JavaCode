package com.training.polymorphism;

import java.util.Scanner;

public class RentalApp {
	
	public static void printDetails(Items item)
	{
		item.getDetails(item.getSerialNum());
		System.out.println("\nRent at 50% rate :  "  + item.getRent(item.getRate(),item.getDays()));
	}

	public static void main(String[] args) {

		//		int input;
//		Fan f = new Fan(1,670.00,2,"Orion","Table fan");
//		Vessels v = new Vessels(1,450.00,3,"Bone China","small");
//		//f.getDetails(1);
//		System.out.println("Enter serial num (1/2): ");
//		
//		Scanner in = new Scanner(System.in);
//		input = in.nextInt();
//		if(input==1){
//			f.getDetails(input);
//			System.out.println("Rent is :  "  + f.getRent(f.getRate(),f.getDays()));
//	}
//		else if(input==2){
//			v.getDetails(input);
//			System.out.println("Rent is : "  + v.getRent(v.getRate(),f.getDays()));
//			}
//		else System.out.println("Wrong input");
//		in.close();
		
		int days;
		int itemNo;
		//int input;
		//Items i[]= new Items[2];
		
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
					//out.println("\nRent at 40% rate : "  + v.getRent(v.getRate(),v.getDays()));
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
