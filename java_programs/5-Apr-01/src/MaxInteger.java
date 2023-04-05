import java.util.Scanner;

public class MaxInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int sum=0;
		int i=1;
		for(;sum<input;i++)
		{
			sum+=i;
			System.out.println(sum);
		}
		System.out.println(i-2);
	}

}
