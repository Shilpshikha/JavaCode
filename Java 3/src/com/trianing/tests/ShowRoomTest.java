package com.trianing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.domains.PassengerCar;
import com.training.ifaces.Automobile;
import com.training.domains.*;

public class ShowRoomTest {

	ShowRoom shrm;
	NewShowRoom nshrm;
	Automobile atmbl;
	//PassengerCar pcar;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		shrm = new ShowRoom();
		nshrm = new NewShowRoom();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPassenger() {
		 
		atmbl = shrm.getItem(1);
		
		//assertEquals(atmbl.getClass(),new PassengerCar().getClass());	
		
		assertTrue("Instanceof Passanger Car", atmbl instanceof PassengerCar);
	}
	
	@Test
	public void testLuxuryCar() {
		
		atmbl = shrm.getItem(2);
		
		assertTrue("Instanceof Passanger Car", atmbl instanceof LuxuryCar);
	}
	
	@Test
	public void testSportsCar() {
		 
		atmbl = shrm.getItem(3);
		assertTrue("Instanceof Passanger Car", atmbl instanceof SportsCar);
	}
	
	@Test
	public void testSportsBike() {
		 
		atmbl = nshrm.getItem(4);
		assertTrue("Instanceof Passanger Car", atmbl instanceof SportsBike);
	}
	
	@Test
	public void testDefaultValue() {
		atmbl = shrm.getItem(5);
		assertNull(atmbl);
	}

}
