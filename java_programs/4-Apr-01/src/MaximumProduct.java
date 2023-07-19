import java.util.Arrays;
import java.util.Scanner;

public class MaximumProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//declare an array of size n
		int arr[]=new int[n];
		
		//get n inputs from the user
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=-1;
		
		//take 1 element in the array at a time
		for(int i=0;i<n;i++)
		{
//			System.out.println("Current element is "+arr[i]);
			//inner loop to multiply curr element with all other
			for(int j=0;j<n;j++)
			{
				int product=0;
				if(i!=j)
				{
//					System.out.println("Multiplying "+arr[i]+" with "+arr[j]);
					product=arr[i]*arr[j];
					//check if product is found as an element in the array
					
					for(int k=0;k<n;k++)
					{
						if(product==arr[k])
						{
//							System.out.println(product + " is matching with an element");
							if(product>max)
								max=product;
						}
					}
				}
			}

		}
		System.out.println("Answer is "+max);
	}
}
