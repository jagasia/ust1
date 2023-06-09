import java.util.Scanner;

public class BookShelf extends Furniture{
	private int noOfShelves;
	
	public BookShelf() {}

	public BookShelf(int noOfShelves) {
		super();
		this.noOfShelves = noOfShelves;
	}

	public int getNoOfShelves() {
		return noOfShelves;
	}

	public void setNoOfShelves(int noOfShelves) {
		this.noOfShelves = noOfShelves;
	}
	
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no Of Shelves:");
		noOfShelves=sc.nextInt();
	}
	
	public void displayDetails()
	{
		System.out.println("No of Shelves: "+noOfShelves);
	}
}
