import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class App2 {

	public static void main(String[] args) throws ParseException {
		Date dt1=new Date();
		Date dt2=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		
		dt1=sdf.parse("10-May-2023");
		dt2=sdf.parse("01-Jan-2000");
		
		java.sql.Date sdt1=new java.sql.Date(dt1.getTime());
		java.sql.Date sdt2=new java.sql.Date(dt2.getTime());
		
		LocalDate ldt1 = sdt1.toLocalDate();
		LocalDate ldt2 = sdt2.toLocalDate();
		
		
		
		Period result = Period.between(ldt2, ldt1);
		
		System.out.println(result.getYears()+" years, "+result.getMonths()+" months and "+result.getDays()+" days!");
		
	}

}
