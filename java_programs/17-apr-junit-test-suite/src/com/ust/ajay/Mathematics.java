package com.ust.ajay;

public class Mathematics {
	int no1;
	int no2;
	public Mathematics() {}
	public Mathematics(int no1, int no2) {
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
	
	public int add()
	{
		return no1+no2+2;
	}
	
	public int subtract()
	{
		return Math.abs(no1-no2);
	}
	
	public int product()
	{
		return no1*no2;
	}
}
