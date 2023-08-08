import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		int noOfCalls=sc.nextInt();
		List<Call> callList=new ArrayList<>();
		List<Contact> contactList = Contact.prefill();
		for(int i=0;i<noOfCalls;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
//			Incoming,STD,0.25,00:01:50,22/01/2018,John
			String[] arr = detail.split(",");
			Call call=new Call();
			call.setType(arr[0]);
			call.setCallType(arr[1]);
			call.setCost(Double.parseDouble(arr[2]));
			SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
			call.setDuration(sdf.parse(arr[3]));
			sdf=new SimpleDateFormat("dd/MM/yyyy");
			call.setDate(sdf.parse(arr[4]));
			//find contact object from prefill using name
			String contactName=arr[5];
			for(Contact c : contactList)
			{
				if(c.getName().equals(contactName))
				{
					call.setContact(c);
					break;
				}
			}
			callList.add(call);
		}
		
		CallLog clog=new CallLog();
		clog.setCallList(callList);
		Contact contact = clog.getFavouriteContact();
		System.out.println("The favourite contact is "+contact.getName());
	}

}
