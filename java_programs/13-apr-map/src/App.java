import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> countryMap=new HashMap<>();
		countryMap.put(12, "China");
		countryMap.put(1, "India");
		countryMap.put(11, "Argentina");
		countryMap.put(12, "Bangladesh");
		countryMap.put(18, "Pakistan");
		countryMap.put(13, "Sri lanka");
		countryMap.put(15, "France");
		countryMap.put(14, "Germany");
		countryMap.put(2, "Italy");
		
//		Set<Entry<Integer, String>> entries = countryMap.entrySet();
//		
//		for(Entry<Integer, String> entry:entries)
//		{
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
//		System.out.println(countryMap);
		
		for(Entry<Integer, String> e:countryMap.entrySet())
		{
			System.out.println(e);
		}
	}

}
