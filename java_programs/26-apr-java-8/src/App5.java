import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class App5 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(248774, "Neethu", " Nelliparambil Rathimohan", "EEE", 120.0));
		empList.add(new Employee(249547, "Bhagyalakshmi", " Suresh", "CSE", 102.0));
		empList.add(new Employee(248825, "Ajay", " C M", "EEE", 210.0));
		empList.add(new Employee(249532, "kalyan", " Jalaneela", "ECE", 122.0));
		empList.add(new Employee(249529, "AISWARYA", " P", "EEE", 112.0));
		empList.add(new Employee(248764, "Ajayakrishnan", " J", "CSE", 212.0));

		Map<String, Long> result = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		for (Entry<String, Long> e : result.entrySet())
			System.out.println(e);

//		min,max sal by dept
//		Map<String, Optional<Employee>> result = empList.stream()
//		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparing(Employee::getSalary)))) ;
//		for(Entry <String, Optional<Employee>> e:result.entrySet())
//			System.out.println(e);

//		Employee emp = empList.stream()
//		.max((a,b)->a.getSalary().compareTo(b.getSalary()))
//		.get();

//		System.out.println(emp);
	}

}
