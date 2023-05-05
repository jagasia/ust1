import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		if(input.matches("#[0-9A-F]{6}"))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
