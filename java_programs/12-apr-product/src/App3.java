import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class IntegerDescComparator implements Comparator<Integer> 
{
	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg1-arg0;
	}	
}
public class App3 {

	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(100,200,55,250,14,20,17,16,19);
		Collections.sort(marks, new IntegerDescComparator());
		System.out.println(marks);
	}

}