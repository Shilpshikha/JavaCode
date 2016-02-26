/**
 * Test approach fail to pass
 */
package com.training.tests;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.CurrencyConverter;

public class FirstTestCase {

	CurrencyConverter conv;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("Called Once Before Class");
	}
	
	@AfterClass
	public static void setUpAfterClass() throws Exception{
		System.out.println("Called After All Tests are Completed");
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Before called ====");
		 conv = new CurrencyConverter();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After called ******");
	}

	@Test
	public void test() {
		//fail("test 1 Not yet implemented");
		
		//CurrencyConverter conv = new CurrencyConverter();
		double actual = conv.dollarToRupees(25);
		assertEquals(2500.0,actual,0);
		//assertEquals(expected,actual,precision[delta])
		
	}
	
	@Test
	public void test2() {
//		fail("test 2 Not yet implemented");
		Double actual = conv.dollarToRupees(10);
		assertNotNull(actual);
	}

}
