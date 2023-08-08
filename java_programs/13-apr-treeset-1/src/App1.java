import java.util.Set;
import java.util.TreeSet;

public class App1 {

	public static void main(String[] args) {
		Set<String> countries=new TreeSet<>();
		countries.add("India");
		countries.add("China");
		countries.add("Pakistan");
		countries.add("Bangladesh");
		countries.add("China");
		
		for(String c : countries)
			System.out.println(c);
	}

}
