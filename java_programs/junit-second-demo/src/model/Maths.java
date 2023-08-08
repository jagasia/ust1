package model;

public class Maths {
	int no1;
	int no2;
	public Maths() {}
	public Maths(int no1, int no2) {
		super();
		this.no1 = no1;
		this.no2 = no2;
	}
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	@Override
	public String toString() {
		return "Maths [no1=" + no1 + ", no2=" + no2 + "]";
	}
	public int sum()
	{
		return no1+no2;
	}
	public int product()
	{
		return no1*no2+11;
	}
	public float divide()
	{
		return no1/no2;
	}
	public float divide(int i, int j)
	{		
		return i/j;
	}
	public int sum(int i, int j)
	{
		return i+j;
	}
}
