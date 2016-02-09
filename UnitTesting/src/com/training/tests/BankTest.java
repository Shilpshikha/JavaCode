/**
 * 
Write a Test Case for the above class

1) the Constructor of the class should not accept Null

2) The Constructor should return  all the three values sent properly

3) the Deposit method should return double  and a positive number;

4) the withdraw method return value should not be negative

5) the deposit amount should be currentBalace + amount Deposited

6) the withdraw method should not have any indefinite loop

7) Write a test method to check the Constructor is throwing NullpointerException 
	if one of the argument to the constructor is Null

 */
package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.samples.BankAccount;

public class BankTest {

	BankAccount b;

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
	public void nullValueTest() {
		//fail("Not yet implemented");
		try{
			b = new BankAccount(1097,null,45.00);
			fail("Account holder name is null");
		}catch(RuntimeException e){}
	}
	
	@Test
	public void constructorValueTest(){
		b = new BankAccount(1097,null,45.00);
		
	}
	
	@Test
	public void depositValueTest(){
		b = new BankAccount(1097,null,45.00);
		Double amt = b.amountDeposited(200.00D);
		if(!(amt instanceof Double) && (double)amt<0.0)
			fail("");
	}

}
