package com.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.samples.PerfectNum;

@RunWith(Parameterized.class)
public class TestPerfectNumberByParameter {
	
	private int number;

	public TestPerfectNumberByParameter(int number) {
		super();
		this.number = number;
	}

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
	public void testPerfectByParam() {
		PerfectNum obj = new PerfectNum();
		boolean actual = obj.isPerfectNum(number);
		assertTrue(number + " not a perfect num ",actual);
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][]{{6},{28},{33},{4}};
		return Arrays.asList(data);
	}

}
