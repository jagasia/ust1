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
		int k=sc.nextInt();
		
		List<Integer> arrCopy=new ArrayList<>();
		for(int i=0;i<n;i++)
			arrCopy.add(arr[i]);
		Collections.sort(arrCopy);
		List<Integer> result=new ArrayList<>();
		//k elements to be added to the result
		for(int i=0;i<k;i++)
		{
			result.add(arrCopy.get(i));
		}
//		System.out.println(result);
		//walk through original array and add elements to result (condionally)
		for(int i=0;i<n;i++)
		{
			//if this current element is not found in result
			if(!result.contains(arr[i]))
				result.add(arr[i]);
		}
		System.out.println(result);
	}

}
