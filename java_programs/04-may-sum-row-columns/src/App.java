import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//row sum	0,0 + 0,1 +0,2
		for(int i=0;i<rows;i++)
		{
			int sum=0;
			for(int j=0;j<cols;j++)
			{
				sum+=arr[i][j];
			}
			System.out.print(sum+"\t");
		}
		System.out.println();
		
		//col sum	0,0	1,0	2,0
		for(int j=0;j<cols;j++)
		{
			int sum=0;
			for(int i=0;i<rows;i++)
			{
				sum+=arr[i][j];
//				System.out.println("i="+i+" : j="+j);
			}
			System.out.print(sum+"\t");
			
		}
	}

}
