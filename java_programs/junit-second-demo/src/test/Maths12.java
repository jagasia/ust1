package test;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class Maths12 {
	@DataPoint
	public static int no1=10;
	@DataPoint
	public static int no2=20;
	@DataPoints
	public static int[] arr= {1,2,3};
	
	@Theory
	public void test(int x, int y, int z)
	{
		System.out.println(x+":"+y+":"+z);
	}
}
