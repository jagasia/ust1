package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import model.Maths;

@RunWith(Parameterized.class)
public class MathsTest11 {
	int expectedResult, no1, no2;
	
	public MathsTest11(int no1, int no2,int expectedResult) {
		super();
		this.expectedResult = expectedResult;
		this.no1 = no1;
		this.no2 = no2;
	}
	Maths aut=new Maths();
	@Test
	public void testSum1()
	{
		assertEquals(expectedResult, aut.sum(no1,no2));
	}
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, 3, 6 },
	         { 6, 3, 9 },
	         { 19, 1, 20 },
	         { 22, 1, 100 },
	         { 23, 1, 24 },
	         {1,2,3}
	      });
	   }
}
