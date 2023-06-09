import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i+=2)
		{
			//space loop
			for(int k=0;k<(n-i)/2;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-2;i>=1;i-=2)
		{
			//space loop
			for(int k=(n-i)/2+1;k>1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
