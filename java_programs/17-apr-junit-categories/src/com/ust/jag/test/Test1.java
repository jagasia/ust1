package com.ust.jag.test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.ust.jag.Aut;

class Test1 {
	Aut aut;
	@Before
	static void setUpBeforeClass() throws Exception {
	}

	@After
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeClass
	void setUp() throws Exception {
		aut=new Aut();
	}

	@AfterClass
	void tearDown() throws Exception {
	}

	@Test
	@Category(Admin.class)
	void testLogin1() {
		System.out.println("Test1 method1 admin");
		assertNull(aut.login("abc", "abc"));
	}

	@Test
	@Category(User.class)
	void testLogin2() {
		System.out.println("Test1 method2 user");
		assertFalse(aut.login("abc", "abc"));
	}

	@Test
	@Category(Admin.class)
	void testLogin3() {
		System.out.println("Test1 method1 admin");
		assertTrue(aut.login("abc", "abc"));
	}

}
