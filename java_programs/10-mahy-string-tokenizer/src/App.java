import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		// split this input by ,
		StringTokenizer st=new StringTokenizer(input, ",");
		
		String arr[]=new String[st.countTokens()];
		int i=0;
//		while(st.hasMoreTokens())
//		{
//			arr[i++]=st.nextToken();
////			System.out.println(st.nextToken());
//			
//		}
//		System.out.println(Arrays.toString(arr));
		
		while(st.hasMoreElements())
		{
//			String str=st.nextElement().toString();
			System.out.println(st.nextElement());
		}
	}

}
