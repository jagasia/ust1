import java.util.Scanner;

public class FullPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int from=sc.nextInt();
		int to=sc.nextInt();
		
		outer:
		for(int i=from;i<=to;i++)
		{
			if(isPrime(i))
			{
				//further check if every digit is prime
				//to convert int into String
//				String str=i+"";
//				System.out.println(i+" is prime. it has following digits");
				String str=String.valueOf(i);
				char[] arr = str.toCharArray();
				
				inner:
				for(char c : arr)
				{
//					System.out.println("Checking if "+c+" is prime or not");
					//convert char into int
					int digit=c-48;
					if(!isPrime(digit))
					{
						//digit is not prime
//						System.out.println(digit + " is not prime, so rejecting "+i);
						continue outer;
					}
				}
//				System.out.println("All digits of "+i+" is prime. So it is eligible");
//				System.out.println("...........");
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int num) {
		//logic to check if the num is prime or not
		if(num<2)
			return false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}
