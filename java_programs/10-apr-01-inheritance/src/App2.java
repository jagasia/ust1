class A
{
	
	public A() {
		System.out.println("This is import line");
	}
	
	public A(int i){
		this();
		System.out.println("Constructor A");
	}
}

class B extends A
{
	public B(){
		super(20);	//super keyword can come as first line of the method only.
		System.out.println("Constructor B");
		
	}
}

class C extends B
{
	public C(){
		System.out.println("Constructor C");
	}
}
class D extends C
{
	public D(){
		System.out.println("Constructor D");
	}
}

public class App2
{
	public static void main(String []args)
	{
		D d=new D();
	}
}