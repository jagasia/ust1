import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayOfWeekTask {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date of Birth: (dd-MMM-yyyy)");
		String input=sc.nextLine();
		Date dob=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		dob=sdf.parse(input);
		
		//to convert date into string we use sdf (but we use different sdf)
		SimpleDateFormat sdf2=new SimpleDateFormat("EEEE");
		String output=sdf2.format(dob);
		System.out.println(output);
	}

}
