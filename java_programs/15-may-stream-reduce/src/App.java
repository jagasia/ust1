import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(1,2,3,4);
		
		int sum=100;
		
		Integer result = marks.stream().filter((a)->a%2==0)
		.reduce(0, (a,b)->a+b);
		
		System.out.println(result);
	}

}
