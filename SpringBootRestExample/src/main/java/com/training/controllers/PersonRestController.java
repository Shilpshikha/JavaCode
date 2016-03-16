package com.training.controllers;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.entity.Person;

@RestController
@RequestMapping("/person")
public class PersonRestController {

	Map<Integer, Person> personMap = new HashMap<>();
	
	@PostConstruct
	public void init(){
		personMap.put(1, new Person(1,"Rahul","rah@abc.com"));
		personMap.put(2, new Person(2,"Priya","pri@abc.com"));
		personMap.put(3, new Person(3,"Arpita","arp@abc.com"));
	}
	
	@RequestMapping("/all")
	public Collection<Person> getAll(){
		return personMap.values();
	}
	
}
