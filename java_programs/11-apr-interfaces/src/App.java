
interface Person {
	void speak();		//abstract method
	static void walk()
	{
		System.out.println("Person walks");
	}
	
	default void run()
	{
		System.out.println("Person runs");
	}
}

interface Human extends Person
{
	
}

class Student implements Person
{
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}
	public void run()
	{
		System.out.println("Student runs");
	}
	
}

public class App
{
	public static void main(String[] args) {
		Person.walk();
//		Person.run();
		Student rama=new Student();
		rama.run();
//		rama.walk();
	}
}