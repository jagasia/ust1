package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Maths;

public class TestException {

	Maths aut=new Maths();
	@Test(expected = ArithmeticException.class)
	public void testSum()
	{
		float result=aut.divide(4,0);
		System.out.println(result);
		assertEquals(4.0f, result,0.1);
	}
}
