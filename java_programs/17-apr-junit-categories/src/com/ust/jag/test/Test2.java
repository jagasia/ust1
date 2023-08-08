package com.ust.jag.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.ust.jag.Aut;

class Test2 {
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
	@Category(User.class)
	void testLogin1() {
		System.out.println("Test1 method1 user");
		boolean result = aut.login("abc", "abc");
		assertSame(result,false);
	}

	@Test
	@Category(Admin.class)
	void testLogin2() {
		System.out.println("Test1 method1 admin");
		assertFalse(aut.login("abc", "abc"));
	}

	@Test
	@Category(User.class)
	void testLogin3() {
		System.out.println("Test1 method1 user");
		assertTrue(aut.login("abc", "abc"));
	}

}
