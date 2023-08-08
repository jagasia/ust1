import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile 1 detail:");
		String detail1=sc.nextLine();
		System.out.println("Enter mobile 2 detail:");
		String detail2=sc.nextLine();
		
		String[] arr1 = detail1.split(",");
		Mobile m1=new Mobile();
		m1.setReferenceId(arr1[0]);
		m1.setModelName(arr1[1]);
		m1.setDisplaySize(Double.parseDouble(arr1[2]));
		m1.setPrice(Double.parseDouble(arr1[3]));
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		m1.setLaunchedDate(sdf.parse(arr1[4]));


		String[] arr2 = detail2.split(",");
		Mobile m2=new Mobile();
		m2.setReferenceId(arr2[0]);
		m2.setModelName(arr2[1]);
		m2.setDisplaySize(Double.parseDouble(arr2[2]));
		m2.setPrice(Double.parseDouble(arr2[3]));
		m2.setLaunchedDate(sdf.parse(arr2[4]));

		System.out.println(m1);
		System.out.println();
		System.out.println(m2);
		System.out.println();
		
		if(m1.equals(m2))
			System.out.println("Equals");
		else
			System.out.println("Not equals");
	}

}
