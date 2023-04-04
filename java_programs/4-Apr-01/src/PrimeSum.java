import java.util.Scanner;

public class PrimeSum {

	public static boolean isPrime(int number)
	{
		//if number is divisible by any other number, it is not prime
		if(number==1)
			return false;
		if(number==2)
			return true;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfElements=sc.nextInt();
		int []arr=new int[noOfElements];
		
		//get n inputs
		for(int i=0;i<noOfElements;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<noOfElements;i++)
		{
			//instead of summing all elements, sum only prime numbers
			//here instead of writing prime algo here, we can create a method
			if(isPrime(arr[i]))
				sum+=arr[i];
		}
		
		System.out.println(sum);
	}

}
