import java.util.Scanner;

public class ForEachDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//access each elements of array
		
		for(int x : arr)
		{
			//we do not use index while using for-each loop
			if(x%2!=0)
				System.out.println(x);
		}
	}

}
