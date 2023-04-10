import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Chair c=new Chair();
		c.acceptDetails();
		c.displayDetails();
		c.method1();
	}

}
