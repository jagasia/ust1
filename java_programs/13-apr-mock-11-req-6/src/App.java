import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of colleges:");
		int n=sc.nextInt();
		List<College> collegeList=new ArrayList<College>();
		
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();		//nextLine comes after nextInt
			if(detail.equals(""))
				detail=sc.nextLine();
//			IIT Madras,www.iitm.ac.in/,9876543210,Govt of India,15,Chennai,30-05-1959
			String[] arr = detail.split(",");
			College college=new College();
			college.setName(arr[0]);
			college.setWebsite(arr[1]);
			college.setMobile(arr[2]);
			college.setFounder(arr[3]);
			college.setNumberOfDept(Integer.valueOf(arr[4]));
			college.setLocation(arr[5]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			college.setCreatedDate(sdf.parse(arr[6]));
			
			collegeList.add(college);
		}
		
		Map<String, Integer> result = College.calculateLocationCount(collegeList);
		
		System.out.format("%-15s %s\n","Location","Count");
		for(Entry<String, Integer> e:result.entrySet())
			System.out.format("%-15s %s\n",e.getKey(),e.getValue());
	}

}
