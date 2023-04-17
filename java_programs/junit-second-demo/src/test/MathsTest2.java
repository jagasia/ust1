package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import model.Maths;

public class MathsTest2 {
	Maths aut=new Maths();
	@Before
	public void setup()
	{
		aut.setNo1(20);
		aut.setNo2(30);
	}
	@Test
	public void testProduct1()
	{
		int result = aut.product();
		assertEquals(6010, result);
	}@Test
	@Category(Admin.class)
	public void testProduct2()
	{
		int result = aut.product();
		assertEquals(6001, result);
	}@Test
	public void testProduct3()
	{
		int result = aut.product();
		assertEquals(1600, result);
	}
}
