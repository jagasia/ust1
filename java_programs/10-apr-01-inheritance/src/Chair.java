import java.io.IOException;
import java.util.Scanner;
//how many properties are there in Chair class
public class Chair extends Furniture{
	private int noOfLegs;
	
	public Chair() {}

	public Chair(int noOfLegs) {
		super();
		this.noOfLegs = noOfLegs;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	//the below method hides the super class method
	
	public void acceptDetails() //throws IOException	NOT ALLOWED
	{
		//i should call the super class method
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no Of Legs:");
		noOfLegs=sc.nextInt();
		super.acceptDetails();
	}
	//what we have done here?
	//super class method is redefined by sub class.
	//this is called as overriding
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("No of Legs: "+noOfLegs);
	}
	
	public void method1()
	{
		System.out.println("method 1");
	}
}
