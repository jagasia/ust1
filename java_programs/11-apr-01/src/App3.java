
abstract class Person
{
	public abstract void speak();
}

class Teacher extends Person
{
	public void speak()
	{
		System.out.println("Teacher speaks");
	}
}

class Student extends Person
{
	public void speak()
	{
		System.out.println("Student speaks");
	}
}

public class App3
{
	public static void main(String args[])
	{
		Person raja;
		raja=new Teacher();
		raja.speak();
	
		raja=new Student();
		raja.speak();
	}
}