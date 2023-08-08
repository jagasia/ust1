import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) throws IOException {
		int x=System.in.read();
		System.out.println(x);
		Scanner sc=new Scanner(System.in);
//		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		System.out.println("Enter your full name:");
		String fullName=sc.nextLine();
		if(fullName.equals(""))
			fullName=sc.nextLine();
		System.out.println("Enter your marks:");
		
		sc=new Scanner(System.in);
		
		float marks=sc.nextFloat();
		sc.close();
		System.out.println(id);
		System.out.println(fullName);
		System.out.println(marks);
		
		
	}

}
