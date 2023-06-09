package com.ust.jag.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ust.jag.Mathematics;

public class MathematicsTest {
	Mathematics aut;
	
	@AfterClass
	
	@BeforeClass
	public static void init()
	{
		System.out.println("This method is executed before all tests. But only once for the test class.");
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Before: setUp method is called");
		aut=new Mathematics();
		aut.setNo1(2);
		aut.setNo2(0);
	}

	@After
	public void tearDown() throws Exception {
		aut=null;
		System.out.println("THis is after");
	}

	@Test
	public void testAdd() {		
		int actual = aut.add();
		assertEquals(5, actual);
	}

	@Test
//	@Ignore
	public void testSubtract() {		
		int actual = aut.subtract();
		assertEquals(-1, actual);
	}

	@Test(expected = ArithmeticException.class)
	public void testProduct() {
		int actual = aut.product();
		assertEquals(6, actual);
	}
	
	

}
