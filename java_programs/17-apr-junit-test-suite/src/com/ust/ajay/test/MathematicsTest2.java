package com.ust.ajay.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import com.ust.ajay.Mathematics;

public class MathematicsTest2 {
	Mathematics aut;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		aut=new Mathematics();
		aut.setNo1(11);
		aut.setNo2(22);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals(33, aut.add());
	}

	@Test
	public void testSubtract() {
		assertEquals(-11, aut.subtract());
	}

	@Test
	public void testProduct() {

		assertEquals(11*22, aut.product());
	}

}
