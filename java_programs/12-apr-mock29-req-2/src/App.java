import java.text.ParseException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Mobile Brand:");
		String name=sc.nextLine();
		MobileBrand mb=new MobileBrand();
		mb.setName(name);
		int choice=-1;
		do
		{
			System.out.println("1.Add Mobile\r\n" + 
					"2.Delete Mobile\r\n" + 
					"3.Display Mobiles\r\n" + 
					"4.Exit\r\n" + 
					"Enter your choice:\r\n" + 
					"");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:		//add
				String detail=sc.nextLine();
				if(detail.equals(""))
					detail=sc.nextLine();
				Mobile mobile=Mobile.createMobile(detail);
				mb.addMobileToMobileBrand(mobile);
				System.out.println("Mobile successfully added");
				break;
			case 2:		//delete
				System.out.println("Enter the reference id of the mobile to be deleted:");
				String referenceId=sc.nextLine();
				if(referenceId.equals(""))
					referenceId=sc.nextLine();
				Boolean status = mb.removeMobileFromMobileBrand(referenceId);
				if(status)
				{
					System.out.println("Mobile successfully deleted");
				}else
				{
					System.out.println("Mobile not found in the Mobile Brand");
				}
				break;
			case 3:		//display
				System.out.println("Mobiles in "+mb.getName());
				mb.displayMobiles();
				break;
				
			}
		}while(choice<4);
	}

}
