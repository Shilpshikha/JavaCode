package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



	@RunWith(Suite.class)
	@SuiteClasses(value = {FirstTestCase.class, SetTestCase.class})
	
	public class MyTestSuite{
		

}
