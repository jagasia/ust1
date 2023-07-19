
public class App {
	int i;
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("world");
		
		Employee raja=new Employee();
//		raja.id=1234;		//The field Employee.id is not visible
		raja.setId(1234);
//		raja.marks=120f;
		
		System.out.println("No error");
	}

}
