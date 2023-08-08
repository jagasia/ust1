import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App2 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		String str = "08-May-2023";
		Date dt = sdf.parse(str);
		System.out.println(dt);
	}

}
