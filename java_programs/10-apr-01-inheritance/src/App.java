import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Chair c=new Chair();
//		c.acceptDetails();
//		c.displayDetails();
//		c.method1();
		
		Furniture f=null;		//for dynamic polymorphism (or) late binding
		
		System.out.println("1: Chair\r\n" + 
				"2: BookShelf\r\n" + 
				"3: Exit");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			f=new Chair();
//			f.method1();
			
			break;
		case 2:
			f=new BookShelf();
			break;
		default:
			System.exit(0);
		}
		
		f.acceptDetails();
		f.displayDetails();
	}

}
