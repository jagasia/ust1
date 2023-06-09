import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
//		List<Integer> marks=Arrays.asList(1,2,3,4);
//		
//		
//		int sum=100;
//		
//		Integer result = marks.stream().filter((a)->a%2==0)
//		.reduce(0, (a,b)->a+b);
//		
//		System.out.println(result);

		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		List<Integer> list2=Arrays.asList(3,4,5,6,7);
		
		List<Integer> temp=new ArrayList<>();
		temp.addAll(list1);
		temp.addAll(list2);
		
		Integer result = temp.stream()
		.filter((x)->Collections.frequency(temp, x)==1)
		.reduce(0,(a,b)->a+b);
		
		System.out.println(result);
	}

}
