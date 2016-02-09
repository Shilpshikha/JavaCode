package com.training.tests;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.samples.Student;
import com.training.samples.StudentList;

public class SetTestCase {

	StudentList lst;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		lst = new StudentList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		/* Dont apply if else*/
//		if(lst.getNames().size()!=2){
//			fail("Duplicate exist");

		
		int actual = lst.getNames().size();
		assertEquals(2,actual);
		
	}

	@Test
	public void testStudentNotNull(){
		Object obj = lst.getStudentList();
		assertNotNull(obj);
	}
	
	@Test
	public void testSetAcceptDuplicate(){
		
		Student s1 = new Student("Ramesh",101);
		Student s2 = new Student("Ramesh",101);
		
		HashSet<Student> stud = new HashSet<Student>();
		 stud.add(s1);
		 stud.add(s2);
		 
		 lst.setNameList(stud);
		 int actual = lst.getNameList().size();
		 assertEquals(1,actual);
	}
	
	@Test
	public void testStudentConstructor(){
		try{
			Student s = new Student(null,103);
			fail("Student name is null");
		}catch(RuntimeException e){}
		
	
	}
}
