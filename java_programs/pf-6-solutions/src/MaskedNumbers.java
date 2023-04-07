import java.util.Scanner;

public class MaskedNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mask = sc.next();
		int y = sc.nextInt();

		boolean isFirst = true;
		boolean anyResult=false;
		for (int i = 0; i < 10; i++) {
//			System.out.println(mask.charAt(0)+""+i+mask.charAt(2));
			String str = mask.charAt(0) + "" + i + mask.charAt(2);
			int num = Integer.parseInt(str);
			if (num % y == 0) {
				//yes a result is found
				anyResult=true;
				if (!isFirst)
					System.out.print(",");

				System.out.print(num);
				isFirst = false;
			}
		}
		if(!anyResult)
			System.out.println(-1);

	}
}