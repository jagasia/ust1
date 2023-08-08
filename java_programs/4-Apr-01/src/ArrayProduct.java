import java.util.Arrays;
import java.util.Scanner;

public class ArrayProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfElements=sc.nextInt();
		
		if(noOfElements<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		//declare an array of size noOfElements
		int arr[]=new int[noOfElements];
		//now, get noOfElements inputs from the user
		for(int i=0;i<noOfElements;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		
		//task is to get the product of all 2 digit numbers.
		//for that i am going to loop all elements of the array
		System.out.println("........................");
		int product=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>9 && arr[i]<100)
				product=product*arr[i];
		}
		System.out.println(product);
	}

}
