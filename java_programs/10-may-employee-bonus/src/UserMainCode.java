import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UserMainCode {
	public TreeMap<Integer, Integer> calculateRevisedSalary(HashMap<Integer, String> hmap1, HashMap<Integer, Integer> hmap2)
	{
		TreeMap<Integer, Integer> result=new TreeMap<>();
		for(Entry<Integer, String> entry:hmap1.entrySet())
		{
			Integer id=entry.getKey();
			String sdob=entry.getValue();
			Integer salary=hmap2.get(id);
//			01-09-2014
			Date today=new Date();
			Date dob=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			try {
				today=sdf.parse("01-09-2014");
				dob=sdf.parse(sdob);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int age=0;
			//manual method. Get the difference of date in millis (long)
			long to=today.getTime();
			long from=dob.getTime();
			long diff=to-from;
			double seconds=diff/1000;
			double mins = seconds/60;
			double hours=mins/60;
			double days=hours/24;
			double years=days/365.25;
			
			//employee age is in years
			double bonus=0.0;
			if(years>=25 && years <=30)
			{
				bonus=(double)20/100*salary;
			}
			else if(years>=31 && years<=60)
			{
				bonus=(double)30/100*salary;
			}
			
			result.put(id, (int)(salary+bonus));
		}
		return result;
	}
}
