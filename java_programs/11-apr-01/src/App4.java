interface Persons
{
	int age=20;
	void speak();
}

class Employee implements Persons
{
	public void speak()
	{
		System.out.println("Employee speaks");
	}
}

public class App4 {

	public static void main(String[] args) {
		System.out.println(Persons.age);
	}

}
