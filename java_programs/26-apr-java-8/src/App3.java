import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App3 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(248774,"Neethu"," Nelliparambil Rathimohan",12345.0));
		empList.add(new Employee(249547,"Bhagyalakshmi"," Suresh",23451.0));
		empList.add(new Employee(248825,"Ajay"," C M",45123.0));
		empList.add(new Employee(249532,"kalyan"," Jalaneela",34512.0));
		empList.add(new Employee(249529,"AISWARYA"," P",19000.0));
		empList.add(new Employee(248764,"Ajayakrishnan"," J",10000.0));

		//filter empList using salary>20000
		//sort empList by salary
		List<Employee> result = empList.stream()
		.filter((a)->a.getSalary()>20000)
//		.sorted((a,b)->a.getSalary().compareTo(b.getSalary()))
		.sorted((a,b)->(int)(a.getSalary()-b.getSalary()))
//		.forEach(System.out::println);
		.collect(Collectors.toList());
		
//		System.out.println(result);
		for(Employee e:result)
		{
			System.out.println(e);
		}
	}

}
