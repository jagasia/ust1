import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of purchases:");
		int noOfPurchases=sc.nextInt();
		List<Purchase> purchaseList=new ArrayList<Purchase>();
		List<User> userList = User.prefill();
		for(int i=0;i<noOfPurchases;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
//			1,750,FIRST,05-06-2018,Rob
			Purchase purchase=new Purchase();
			purchase.setId(Integer.valueOf(arr[0]));
			purchase.setPrice(Double.valueOf(arr[1]));
			purchase.setCouponCode(arr[2]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			purchase.setPurchaseDate(sdf.parse(arr[3]));
			String userName=arr[4];
			//find user object using userName
			for(User user: userList)
			{
				if(user.getName().equals(userName))
				{
					purchase.setUser(user);
					user.getPurchaseList().add(purchase);
				}
			}
			purchaseList.add(purchase);
		}
		System.out.println("Enter the month:");
		String month=sc.next();
		User result = User.getValuableUser(userList, month);
		System.out.println("The valuable user of the month June is "+result.getName());
		
	}

}
