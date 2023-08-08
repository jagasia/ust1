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
		
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>num)
				sum+=arr[i];
		}
		
		//reverse the sum
		StringBuilder sb=new StringBuilder(sum+"");
		sb.reverse();
		int result=Integer.parseInt(sb.toString());
		System.out.println(result);
	}

}
