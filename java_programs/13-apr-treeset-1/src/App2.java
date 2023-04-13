import java.util.TreeSet;

public class App2 {

	public static void main(String[] args) {
//		TreeSet<Employee> empSet=new TreeSet<Employee>((a,b)->a.getId().compareTo(b.getId()));
		TreeSet<Employee> empSet=new TreeSet<Employee>();
		empSet.add(new Employee(12, "Rajesh", "Kumar", "Chennai"));
		empSet.add(new Employee(11, "Suresh", "Kumar", "Kochi"));
		empSet.add(new Employee(12, "Ramesh", "Kanna", "Chennai"));
		empSet.add(new Employee(10, "Ajith", "Kumar", "Chennai"));
		empSet.add(new Employee(12, "Mahesh", "Kumar", "Chennai"));
		empSet.add(new Employee(12, "Ashwin", "Kumar", "Chennai"));
		empSet.add(new Employee(12, "Munish", "Kumar", "Chennai"));
//		
//		System.out.println(empSet.size());
		for(Employee e : empSet)
			System.out.println(e);
	}

}
