import java.util.Arrays;
import java.util.Comparator;

class DescComparator implements Comparator<Integer>
{
	public int compare(Integer a, Integer b)
	{
		return b-a;
	}
}

public class App {

	public static void main(String[] args) {
		Integer arr[]= {50,20,60,10,70,40,30};
//		Arrays.sort(arr, new DescComparator());
		Arrays.sort(arr,(a,b)->b-a);
		
		System.out.println(Arrays.toString(arr));
	}

}
