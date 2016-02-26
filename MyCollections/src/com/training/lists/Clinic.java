package com.training.lists;

import java.util.*;

import com.training.utils.MyComparators;

public class Clinic{

	//Creating typesafe ordered collection
	
	private ArrayList<Doctor> docList;// = new ArrayList<Docyor>();
	
	public Clinic() {
		
		docList = new ArrayList<Doctor>();
		
	}

	public boolean addDoctor(Doctor doc){
		
		boolean result = docList.add(doc);
		return result;
	}
	
	public void printDoctorList(){
		for(Doctor doc : docList){
			System.out.println(doc);
			if(doc.getPatients()!=null){
				System.out.println("Appointments");
				for(Patient pat : doc.getPatients())
				{
					System.out.println(pat);
				}
			}
			else
				System.out.println("No Appointments");
		}
	}
	
//	public void printPatientList(){
//		for(Patient pat : docList){
//			System.out.println(doc);
//		}
//	}
	
	MyComparators comp = new MyComparators();
	public void printSortedList(int key){
		
//		Collections.sort(docList);
//		printDoctorList();
	
		switch(key){
		case 1: 
			Collections.sort(docList);
			printDoctorList();
			break;
			
		case 2: 
			MyComparators.NameComparator comp1 = comp.new NameComparator();
			Collections.sort(docList,comp1);
			printDoctorList();
			break;
		case 3:
			MyComparators.SpecializationComparator comp2 = comp.new SpecializationComparator();
			Collections.sort(docList,comp2);
			printDoctorList();
			break;
		default :  break;
			
		}
	}


}
