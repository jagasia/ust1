import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntToInteger {
    public static void main(String[] args) {

        int[] intArray = {10, 20, 30, 40};

        List<Integer> integerArray = Arrays.stream(intArray)
		.boxed()
		.collect(Collectors.toList());
        

        System.out.println(integerArray);
        
        Set<Integer> result = Arrays.stream(intArray)
        .filter((a)->a>=30)
        .sorted()
//        .forEach(System.out::println);
        .boxed()
        .collect(Collectors.toSet());
        
        
    }
}