import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App5 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(248774,"Neethu"," Nelliparambil Rathimohan","EEE",10.0));
		empList.add(new Employee(249547,"Bhagyalakshmi"," Suresh","CSE",10.0));
		empList.add(new Employee(248825,"Ajay"," C M","EEE",10.0));
		empList.add(new Employee(249532,"kalyan"," Jalaneela","ECE",10.0));
		empList.add(new Employee(249529,"AISWARYA"," P","EEE",10.0));
		empList.add(new Employee(248764,"Ajayakrishnan"," J","CSE",10.0));

		Map<String, Double> result = empList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
		for(Entry<String, Double> e:result.entrySet())
			System.out.println(e);
	}

}
