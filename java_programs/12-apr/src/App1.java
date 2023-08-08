import java.util.Arrays;

public class App1 {

	public static void main(String[] args) {
		Integer []marks= {12,90,45,87,77,25,35,28};
		Arrays.sort(marks, (a,b)->b-a);
		System.out.println(Arrays.toString(marks));
	}

}
