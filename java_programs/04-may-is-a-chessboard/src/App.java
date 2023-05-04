import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int input[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				input[i][j]=sc.nextInt();
			}
		}
		
		//based on the first element 0,0 the entire chessboard can be planned
		//check our plan with actuals then decide true or false.

		int ideal[][]=new int[rows][cols];
		int first = input[0][0];
		first=Math.abs(first-1);
		
		int rowStart=first;
		for(int i=0;i<rows;i++)
		{	
			first=rowStart;
			for(int j=0;j<cols;j++)
			{
				first=Math.abs(first-1);
				ideal[i][j]=first;
			}
			rowStart=Math.abs(rowStart-1);
		}
		
		int countErrors=0;
		for(int i=0;i<rows;i++)
		{
			
			for(int j=0;j<cols;j++)
			{
//				System.out.print(ideal[i][j]+"\t");
				if(input[i][j]!=ideal[i][j])
				{
					countErrors++;
				}
			}
//			System.out.println();
		}
		System.out.println(countErrors==0);
		if(countErrors>0)
		{			
			System.out.println(countErrors);
		}
	}

}
