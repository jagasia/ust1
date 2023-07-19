import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collections;

public class App1 {

	public static void main(String[] args) {
		
		
		List<String> countries=Arrays.asList("India","Australia","China","Bangladesh","Sri lanka","Pakistan","Zimbabwe","Denmark","England");
//		Stream<String> s = countries.stream();
//		s=s.sorted((a,b)->b.compareTo(a));
//		s.forEach(System.out::println);
		
	List<String> result = countries.stream()
		.sorted((a,b)->b.compareTo(a))
//		.forEach(System.out::println);
		.collect(Collectors.toList());
		
		System.out.println(countries);
		System.out.println(result);
	}

}
