import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {

	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar();
		gc.setTime(new Date());
		//display the year
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.HOUR));
		
		//From today, after 100 days, what will be the day
		
		gc.add(Calendar.DATE, 15*7);
		
		System.out.println(gc.getTime());
	}

}
