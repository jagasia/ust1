import java.util.Scanner;
import java.util.regex.Pattern;

public class UniversityReq3 {

	static Boolean validateWebsite(String website)
	{
		String regex="((http://)|(https://)){1}(www[.])?([A-Za-z]+)[.]{1}([a-z]{2,3})([.]{1}[a-z]{2,6})?";		
		return Pattern.matches(regex, website);
	}
	static Boolean validateMobile(String mobileNo)
	{
		String regex="([+]91){1}[ ]?[0-9]{10}";
		return Pattern.matches(regex, mobileNo);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu:\r\n" + 
				"1.Validate Website\r\n" + 
				"2.Validate Mobile number\r\n" + 
				"");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:		//validate website
			System.out.println("Enter the Website to be validated:");
			String website=sc.next();
			if(validateWebsite(website))
			{
				System.out.println("Website is valid");
			}else
			{
				System.out.println("Website is invalid");
			}
			break;
		case 2:		//validate mobile number
			System.out.println("Enter the Mobile no. to be validated:");
			String mobileNo=sc.next();
			if(validateMobile(mobileNo))
			{
				System.out.println("Mobile number is valid");
			}else
			{
				System.out.println("Mobile number is invalid");
			}
			break;			
		}
	}

}
