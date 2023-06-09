import java.util.Arrays;
import java.util.Scanner;

public class LastCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		char []arr=new char[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		
		int n=sc.nextInt();
		
		//check if a char is found n times or not.

		char result='\0';
		
		for(int i=0;i<size;i++)
		{
//			System.out.println(arr[i]);
			int count=0;
			for(int j=0;j<size;j++)
			{
//				System.out.println("Comparing "+arr[i]+" with "+arr[j]);
				if(arr[i]==arr[j])
					count++;
			}
//			System.out.println(arr[i]+" is found "+count+" times");
			if(count==n)
			{
//				System.out.println(arr[i]+" is eligible to be answer");
				result=arr[i];
			}
		}
//		System.out.println("Finally:");
		if(result!='\0')
			System.out.println(result);
		else
			System.out.println(-1);
		
	}

}
