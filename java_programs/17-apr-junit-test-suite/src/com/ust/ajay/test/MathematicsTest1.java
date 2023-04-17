package com.ust.ajay.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import com.ust.ajay.Mathematics;

public class MathematicsTest1 {
	Mathematics aut;
	

	@BeforeEach
	void setUp() throws Exception {
		aut=new Mathematics();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		aut.setNo1(2);
		aut.setNo2(3);
		assertEquals(5, aut.add());
	}

	@Test
	public void testSubtract() {
		aut.setNo1(2);
		aut.setNo2(3);
		assertEquals(-1, aut.subtract());
	}

	@Test
	public void testProduct() {
		aut.setNo1(2);
		aut.setNo2(3);
		assertEquals(6, aut.product());
	}
	
	@Test
	public void mockTest()
	{
		Mathematics m = mock(Mathematics.class);
		when(m.add()).thenReturn(200);
		
	}
}
