import java.text.ParseException;
import java.util.HashSet;

public class App2 {

	public static void main(String[] args) throws ParseException {
		HashSet<Employee> empSet=new HashSet<Employee>();
		empSet.add(new Employee(13, "Ajay", "M", "20-Mar-2023","ajay@india.com"));
		empSet.add(new Employee(12, "Ashwin", "C.K", "21-Mar-2023","ashwin@india.com"));
		empSet.add(new Employee(21, "Malayali", "Reenu", "15-Mar-2023","reenu@india.com"));
		empSet.add(new Employee(8, "Munish", "Kumar", "17-Mar-2023","munish@india.com"));
		empSet.add(new Employee(9, "Sidharth", "Sanil", "25-Mar-2023","sidharth@india.com"));
		empSet.add(new Employee(17, "Kalyan", "Jennie", "12-Mar-2023","kalyan@india.com"));
		empSet.add(new Employee(16, "Kalyan", "Jennie", "12-Mar-2023","kalyan@india.com"));
		
		for(Employee e : empSet)
			System.out.println(e);
	}

}
