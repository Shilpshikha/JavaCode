package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.samples.PerfectNum;

public class PerfectNoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReturnType() {
	//	fail("Not yet implemented");
	
		PerfectNum num = new PerfectNum();
		boolean actual = num.isPerfectNum(28);
		assertTrue(actual);
	}
	
	@Test(expected = Exception.class)
	public void testPositive() throws Exception{
		PerfectNum num = new PerfectNum(-30);
		int actual = num.getN();
		assertTrue(actual>0);
	}
	
	@Test(timeout=100)
	public void testLoop(){
		
	}

}
