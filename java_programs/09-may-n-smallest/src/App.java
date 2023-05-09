import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int count=sc.nextInt();
		
		List<Integer> alist=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			alist.add(arr[i]);
		}
		
		Collections.sort(alist);
		alist=alist.subList(0, count);
//		System.out.println(alist);
		int result[]=new int[count];
		for(int i=0,j=0;i<n;i++)
		{
//			if(arr[i] is present in the alist)
			if(alist.contains(arr[i]))
				result[j++]=arr[i];
		}
		
		for(int i=0;i<count;i++)
		{
			System.out.print(result[i]+" ");
		}
	}

	
}
