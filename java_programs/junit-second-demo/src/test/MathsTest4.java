package test;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MathsTest4 {

	@DataPoint
	public static int no1=2;
	@DataPoint
	public static int no2=3;
	@DataPoints
	public static int arr[]= {1,2,3};
	@Theory
	public void theory(int x, int y)
	{
		System.out.println(x+":"+y);
	}
}
