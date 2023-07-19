import java.util.ArrayList;
import java.util.List;

public class App6 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(248774,"Neethu"," Nelliparambil Rathimohan","EEE",120.0));
		empList.add(new Employee(249547,"Bhagyalakshmi"," Suresh","CSE",102.0));
		empList.add(new Employee(248825,"Ajay"," C M","EEE",210.0));
		empList.add(new Employee(249532,"kalyan"," Jalaneela","ECE",122.0));
		empList.add(new Employee(249529,"AISWARYA"," P","EEE",112.0));
		empList.add(new Employee(248764,"Ajayakrishnan"," J","CSE",212.0));
		
		
		empList.stream()
		.filter((a)->a.getFirstName().length()>10)
		.map((e)->e.getFirstName().toUpperCase())		
		.forEach(System.out::println);
	}

}
