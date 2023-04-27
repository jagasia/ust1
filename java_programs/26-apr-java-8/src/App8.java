import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App8 {

	public static void main(String[] args) {
		
		List<Integer> collected = Stream.of(1, 2, 3, 4)
				  .collect(Collectors.toList());
		
		System.out.println(collected);
		
	}

}
