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

@RunWith(Parameterized.class)
public class MathsTest3 {
	int no1, no2, expectedResult;
	Maths aut=new Maths();
	public MathsTest3(int no1, int no2, int expectedResult)
	{
		this.no1=no1;
		this.no2=no2;
		this.expectedResult=expectedResult;
	}
	@Before
	public void setup()
	{
	}
	@Test
	public void testSum1()
	{
		assertEquals(expectedResult, aut.sum(no1,no2));
	}
	
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, 3, 5 },
	         { 6, 3, 9 },
	         { 19, 1, 20 },
	         { 22, 1, 23 },
	         { 23, 1, 24 }
	      });
	   }
	
}
