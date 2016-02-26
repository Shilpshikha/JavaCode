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

	BankAccount ba;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Called before all tests");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
		System.out.println("Called after all tests");
	}

	@Before
	public void setUp() throws Exception {
		String name = "Bhavna";
		long accno = 103L;
		double balance = 5000.660;
		ba = new BankAccount(accno,name,balance);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNullValue() {
		//fail("Not yet implemented");
		try{
			ba = new BankAccount(107L,null,450.663);
			fail("Account holder name is null");
		}catch(RuntimeException e){}
	}
	
	@Test
	public void testConstructorValue(){
	
//		long actual = 102L;
//		assertEquals(ba.getAccno(),actual);
		double actual = 5000.06;
		assertEquals(ba.getBalance(),actual,0);
	}
	
	@Test
	public void testDepositValue(){
		
		 
		 double actual = -200.00;
		 ba.amountDeposited(actual);
		//assertFalse("Balance should be greater than 0", actual<0);
		assertTrue("balance should be greater than 0" , actual>0);
	}
	

	@Test
	public void testWithdrawnValue(){
		
		double actual = ba.amountWithdrawn(6000.00);
		assertFalse("Overdraft not allowed", actual<0);
	}
	
	@Test
	public void testDepositAmt(){
		double actual = ba.amountDeposited(1000.00);
		assertEquals(4000.00, actual,0);
	}
	
	@Test(timeout =100)
	public void testWithdrawLoop(){
		
		ba.withdraw(200.00);
		//fail("Infinite loop");
	}
	
	@Test(expected = NullPointerException.class)
	public void testExceptionType() throws Exception{
		
		ba = new BankAccount(109L,null,4500.00);
		
	}
}
