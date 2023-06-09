import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) throws FileNotFoundException {
		//write a java program to read the contents of ajay.txt
		Scanner sc=new Scanner(new File("ajay.txt"));
		String str=sc.nextLine();
		System.out.println(str);
	}

}
