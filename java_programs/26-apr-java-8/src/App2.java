import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//class A implements Predicate<Integer>
//{
//
//	@Override
//	public boolean test(Integer t) {
//		return t>80;
//	}
//	
//}

public class App2 {

	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(44,66,11,55,99,22,88,77,33);
		marks.stream()
//		.filter(new A())
		.filter((t)->t>80)
		.sorted()
		.forEach(System.out::println);
	}

}
