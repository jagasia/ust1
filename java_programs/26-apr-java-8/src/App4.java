
public class App4 {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyWork()::work);
		t1.start();
	}

}
