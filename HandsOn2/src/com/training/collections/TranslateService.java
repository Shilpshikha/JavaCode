package com.training.collections;

import java.util.*;
public class TranslateService {

	private Hashtable<String, String> hindiToEnglish;
	
	public TranslateService() {
		//Hashtable instantiate
		hindiToEnglish =  new Hashtable<String, String>();
	}
	
	public void init(){
		//put method
		hindiToEnglish.put("ek","ONE");
		hindiToEnglish.put("do","TWO");
		hindiToEnglish.put("teen","THREE");
	}
	
	public String findEngWord(String hindiWord){
		//get method
		return hindiToEnglish.get(hindiWord);
	}
	
	public void printWords(){
		//convert to entry set and retrieve
		Set<Map.Entry<String, String>> list = hindiToEnglish.entrySet();
		System.out.println("Hindi - English Words");
		
		for(Map.Entry<String, String> words : list){
			System.out.println(words.getKey()  +  "  = " + words.getValue());
		}
	}
	
//	public void printWordJ8(){
//		hindiToEnglish.forEach((k,v)->{System.out.println(k + " = " + v);});
//	}

	
}
