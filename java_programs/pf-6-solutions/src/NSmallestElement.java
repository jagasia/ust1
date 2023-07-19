import java.util.Arrays;
import java.util.Scanner;

public class NSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfElements=sc.nextInt();
		int arr[]=new int[noOfElements];
		for(int i=0;i<noOfElements;i++)
		{
			arr[i]=sc.nextInt();			
		}
		
		int n=sc.nextInt();
		
		//logic begins. Take a copy of arr
		
		int[] copyArr = arr.clone();
		
		Arrays.sort(copyArr);

		int arr2[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr2[i]=copyArr[i];
		}
		
		//iterate the original array
		
		for(int i=0;i<noOfElements;i++)
		{
//			if arr[i] is present in the arr2 then print
			
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr2[j])
					System.out.println(arr[i]);
			}
		}
		
	}

}
