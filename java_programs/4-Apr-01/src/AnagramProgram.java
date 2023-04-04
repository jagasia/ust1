import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		String input2=sc.next();
		
		//convert the Strings to char arrays
		char arr1[]=input1.toCharArray();
		char arr2[]=input2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String str1=new String(arr1);
		String str2=new String(arr2);
		
		if(str1.equals(str2))
			System.out.println("Anagrams");
		else
			System.out.println("Not anagrams");
	}
}
