package com.training.utils;

import java.util.Comparator;
import com.training.lists.*;

public class MyComparators{

	//Inner class - named class (Anonymous Class - without name)
	public class NameComparator implements Comparator<Doctor>{
		
			@Override
			public int compare(Doctor o1, Doctor o2) {
				//o1.compareTo(o2) - comparing IDs
	
				//String Class already implements Comparable
				//Doctor class is encapsulated hence using getter Method
				
				return o1.getDocName().compareTo(o2.getDocName());
				
			}
	}
	
	public class SpecializationComparator implements Comparator<Doctor>{
		
		@Override
		public int compare(Doctor o1, Doctor o2) {
			
			return o1.getSpecialization().compareTo(o2.getSpecialization());
		}
	}

}
