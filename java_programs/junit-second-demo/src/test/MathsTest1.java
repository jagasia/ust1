package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import model.Maths;

public class MathsTest1 {
	Maths aut=new Maths();
	@Before
	public void setup()
	{
		aut.setNo1(20);
		aut.setNo2(30);
	}
	@Test
	@Category(Admin.class)
	public void testSum1()
	{
		int result = aut.sum();
		assertEquals(510, result);
	}
	@Test
	
	public void testSum2()
	{
		int result = aut.sum();
		assertEquals(150, result);
	}
	
	@Test
	@Category({Admin.class, User.class})
	
	public void testSum3()
	{
		int result = aut.sum();
		assertEquals(501, result);
	}
	
}
