import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(12, "Ajay", "M", "Ernakulam"));
		empList.add(new Employee(5, "Ashwin", "C.K", "Ernakulam"));
		empList.add(new Employee(21, "Malayali", "Reenu", "Chenganur"));
		empList.add(new Employee(15, "Munish", "Kumar", "Jammu"));
		empList.add(new Employee(8, "Sidharth", "Sanil", "Ernakulam"));
		empList.add(new Employee(16, "Kalyan", "Jennie", "Hyderabad"));
		
		Collections.sort(empList);
		
		for(Employee e : empList)
		{
			System.out.println(e);
		}
	}

}
