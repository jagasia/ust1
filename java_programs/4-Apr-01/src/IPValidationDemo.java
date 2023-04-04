import java.util.Arrays;
import java.util.Scanner;

public class IPValidationDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String[] arr = input.split("[.]");
		//check#1	there should be 4 portions
		if(arr.length!=4)
		{
			System.out.println("Invalid IP");
			System.exit(0);
		}
		//loop each portion
		for(String str : arr)
		{
			//	check#2 	each portion should be number
//			convert it to number and if you get error, then it is not a number
			int no=0;
			try
			{
				no=Integer.parseInt(str);
				//it is a number only.
				//check#3	range should be 0-255 only
				if(no<0 ||	no>255)
				{
					System.out.println("Invalid IP");
					System.exit(0);
				}
			}catch(NumberFormatException nfe)
			{
				System.out.println("Invalid IP");
				System.exit(0);
			}
			
			
		}
		
		System.out.println("Valid IP");
	}

}
