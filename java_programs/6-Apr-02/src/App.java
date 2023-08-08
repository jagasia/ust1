import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter college 1 detail:");
		String detail1=sc.nextLine();
		System.out.println("Enter college 2 detail:");
		String detail2=sc.nextLine();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		String[] arr1 = detail1.split(",");
		College college1=new College();
		college1.setName(arr1[0]);
		college1.setWebsite(arr1[1]);
		college1.setMobile(arr1[2]);
		college1.setFounder(arr1[3]);
		college1.setNumberOfDept(Integer.valueOf(arr1[4]));
		college1.setLocation(arr1[5]);
		college1.setStartingDate(sdf.parse(arr1[6]));
		
		String[] arr2 = detail2.split(",");
		College college2=new College();
		college2.setName(arr2[0]);
		college2.setWebsite(arr2[1]);
		college2.setMobile(arr2[2]);
		college2.setFounder(arr2[3]);
		college2.setNumberOfDept(Integer.valueOf(arr2[4]));
		college2.setLocation(arr2[5]);
		college2.setStartingDate(sdf.parse(arr2[6]));
		
		System.out.println("College 1:");
		System.out.println(college1);
		System.out.println();
		System.out.println("College 2:");
		System.out.println(college2);
		
//		System.out.println(college1.equals(college2));
		System.out.println((college1.equals(college2))?"College 1 is same as College 2 ":"College 1 and College 2 are different");
		
	}

}
