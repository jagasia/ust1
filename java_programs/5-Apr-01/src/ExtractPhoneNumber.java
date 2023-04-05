import java.util.Scanner;

public class ExtractPhoneNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		char[] arr = input.toCharArray();
		
		for(char c : arr)
		{			
			if(Character.isDigit(c))
				System.out.println(c);
		}
	}

}
