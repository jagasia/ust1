class Super
{
	
	public static Super getInstance()
	{
		return new Super();
	}
}

class Sub extends Super
{
	public static Sub getInstance()
	{
		return new Sub();
	}
}

public class App {

	public static void main(String[] args) {
		float f=12.5f;
		long l=20;
		l=9876543210L;
		System.out.println(f);
		System.out.println(l);
	}

}
