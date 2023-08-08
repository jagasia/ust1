import java.util.Scanner;
import java.util.StringTokenizer;

public class IPValidationUsingStringTokenizer {

	public static void main(String[] args) {
		String input=new Scanner(System.in).next();
		StringTokenizer st=new StringTokenizer(input, ".");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
