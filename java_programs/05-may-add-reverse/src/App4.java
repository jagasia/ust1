
public class App4 {

	public static void main(String[] args) {
		int i=0;
		i+=20;
		i*=20;
		assert i<1000;
		System.out.println(i);
		i-=100;
		i/=100;
		assert i>10;
		System.out.println(i);
	}

}
