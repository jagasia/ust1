import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App7 {

	public static void main(String[] args) {
		String str="This sentence is typed by me. You are going to work on this.";
		char[] carr = str.toLowerCase().toCharArray();
		List<Character> cList=new ArrayList<>();
		for(char c : carr)
			cList.add(c);
		
		//cList is the collection of characters
		
		Map<Character, Long> result = cList.stream()
		.collect(Collectors.groupingBy(Character::charValue,Collectors.counting()));
		
		for(Entry<Character, Long> e:result.entrySet())
			System.out.println(e);
		
	}

}
