import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYearTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		GregorianCalendar gc=new GregorianCalendar();
		
		if(gc.isLeapYear(year))
			System.out.printf("Yes %d is leap year",year);
		else
			System.out.printf("No %d is not leap year",year);
	}

}
