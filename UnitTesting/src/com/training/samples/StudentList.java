package com.training.samples;
import java.util.*;

public class StudentList {
	
	HashSet<String> names;
	Set<Student> nameList;
	
	public StudentList(){
		names = new HashSet<String>();
	//	nameList = new HashSet<Student>(); //returns null if not 
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ramesh");
	}
	
	public Set<String> getNames(){
		return names;
	}

	public Set<Student> getStudentList() {
		// TODO Auto-generated method stub
		return nameList;
	}

	public Set<Student> getNameList() {
		return nameList;
	}

	public void setNameList(Set<Student> nameList) {
		this.nameList = nameList;
	}

	public void setNames(HashSet<String> names) {
		this.names = names;
	}
	
	
}
