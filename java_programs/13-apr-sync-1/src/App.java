class MyThread extends Thread
{
	One one;
	public MyThread()
	{}
	
	public MyThread(One one)
	{
		this.one=one;
	}
	public void run()
	{
		one.method1();
	}
}

public class App {

	public static void main(String[] args) {
		One one=new One();
		One two=new One();
		MyThread t1=new MyThread(two);
		MyThread t2=new MyThread(two);
		
		t1.setName("thread1");
		t2.setName("THREAD TWO");
		
		t1.start();
		t2.start();
	}

}
