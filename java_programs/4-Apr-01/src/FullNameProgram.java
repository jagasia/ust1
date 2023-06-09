import java.util.Arrays;
import java.util.Scanner;

public class FullNameProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fullName=sc.nextLine();
		
		//split string by space
		String[] arr = fullName.split(" ");
		String result="";
		for(int i=0;i<arr.length-1;i++)
		{
			result+=Character.toUpperCase(arr[i].charAt(0));
			result+=".";
		}
//		result+=arr[arr.length-1];
		String lastWord=arr[arr.length-1];
		lastWord=lastWord.toUpperCase();
		result+=lastWord.charAt(0);
		result+=lastWord.substring(1).toLowerCase();
		System.out.println(result);
	}

}
