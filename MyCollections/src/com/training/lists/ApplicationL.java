package com.training.lists;

import java.util.HashSet;
import java.util.TreeSet;

public class ApplicationL {

	public static void main(String[] args) {
		
		Doctor d1 = new Doctor(102,"Daniel","ENT");
		Doctor d2 = new Doctor(103,"Shivam","Cardiologist");
		Doctor d3 = new Doctor(101,"Bhaskar","Orthopedic");
		
		Clinic c = new Clinic();
		
		c.addDoctor(d1);
		c.addDoctor(d2);
		c.addDoctor(d3);
		
//		System.out.println("\n\nSorted(Desc) acc to ID  :");
//		c.printSortedList(1);
	
//		System.out.println("\n\nSorted acc to Specialization  :");
//		c.printSortedList(3);
		
		Patient p1 = new Patient(901,"Gaurav",20,984563);
		Patient p2 = new Patient(902,"Saurav",28,921213);
		Patient p3 = new Patient(903,"Reshav",14,956763);
		Patient p4 = new Patient(903,"Reshav",14,956763);
		
		//TreeSet<Patient> patients = new TreeSet<Patient>();
		//HashSet is not ordered and TreeSet is ordered hence we require comparison
		//HashSet<Patient> patients = new HashSet<Patient>();
		
		TreeSet<Patient> patients = new TreeSet<Patient>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		patients.add(p4);
		d1.setPatients(patients);
		
		System.out.println("\n\nSorted acc to Name  :");
		c.printSortedList(2);
//		for(Patient pat : patients){
//			System.out.println(pat);
//		}

	}

}
