import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExValidation1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
//		System.out.println(input.matches("E\\d{3}"));
//		Pattern p=Pattern.compile("E\\d{3}");
//		System.out.println(Pattern.matches("E\\d{3}", input));
		System.out.println(Pattern.matches("[a-z]+([.][a-z]+)?@[a-z]+[.]((com)|(co[.]in))", input));
		
	}

}
