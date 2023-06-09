import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		String input=new Scanner(System.in).next();
		//get the reverse of input
		StringBuilder sb=new StringBuilder(input);
		sb.reverse();
		if(input.equalsIgnoreCase(sb.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
