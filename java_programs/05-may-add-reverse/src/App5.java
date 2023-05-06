
public class App5 {

	public static void method1()
	{
		throw new AssertionError("Hi");
	}
	
	public static void main(String[] args) {
		try
		{
			method1();
		}catch(Error ex)
		{
			System.out.println("Error handled: "+ex.getMessage());
		}
	}

}
