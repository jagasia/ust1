import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer, String> hmap1=new HashMap<>();
		HashMap<Integer, Integer> hmap2=new HashMap<>();
		for(int i=0;i<n;i++) 
		{
			Integer id=sc.nextInt();
			String dob=sc.nextLine();
			if(dob.equals(""))
				dob=sc.nextLine();
			Integer salary=sc.nextInt();
			hmap1.put(id, dob);
			hmap2.put(id, salary);
		}
		
		UserMainCode umc=new UserMainCode();
		TreeMap<Integer, Integer> result = umc.calculateRevisedSalary(hmap1, hmap2);
		
		for(Entry<Integer, Integer> e:result.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
	}

}
