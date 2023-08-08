import java.util.Scanner;

public class App {

	public static int digitSum(int num)
	{
		int sum=0;
		if(num>9)
		{
			//get the digits and sum
			String str=num+"";
			sum=0;
			for(char c : str.toCharArray())
			{
				int digit=Character.getNumericValue(c);
				sum+=digit;
			}
			if(sum>9)
				return digitSum(sum);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println(digitSum(input));
	}

}
