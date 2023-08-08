import java.util.Scanner;

public class MileageCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double petrolPrice=sc.nextDouble();
		double distanceCovered=sc.nextDouble();
		int amount=sc.nextInt();
		
		double litres=(double)amount/petrolPrice;
		
		double mileage=distanceCovered/litres;
//		mileage*=100;
//		mileage=Math.round(mileage);
//		mileage/=100;
		
//		String str=String.format("%.2f", mileage);
//		mileage=Double.parseDouble(str);
//		System.out.println(mileage);
		
		System.out.format("%.2f", mileage);
		
	}
}
