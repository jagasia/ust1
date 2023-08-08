import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTask1 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date of Joining (dd/MM/yyyy):");
		String input=sc.nextLine();
		//convert String into Date
		Date dateOfJoining=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		dateOfJoining = sdf.parse(input);
		System.out.println(dateOfJoining);
		System.out.println(sdf.format(dateOfJoining));
	}

}
