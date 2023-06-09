import java.util.Scanner;

public class HistoricalEra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		//find the century. 	1947	=	20th
		int century=year/100;
		
		if(year%100!=0)
			century++;
		
//		Prehistorical period       -    0-2nd
//		Vedic Period                      -    3rd-6th
//		Second Urbanisation    -    7th-13th
//		Early Modern Period      -    14th-18th
//		Modern Period                  -    19th-present

		System.out.println(century);
		if(century<0)
		{
			System.out.println("Invalid");
		}else if(century<=2)
		{
			System.out.println("Prehistorical period");
		}else if(century<=6)
		{
			System.out.println("Vedic Period");
		}else if(century<=13)
		{
			System.out.println("Second Urbanisation");
		}else if(century<=18)
		{
			System.out.println("Early Modern Period");
		}else
		{
			System.out.println("Modern Period");
		}
			
	}

}
