import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list1=new ArrayList<String>();
		
		ArrayList<String> list2=new ArrayList<String>();
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			String input=sc.next();
			list1.add(input);
		}
		
//		list1.removeIf((x)->x.toLowerCase().charAt(x.length()-1)=='a' || x.toLowerCase().charAt(x.length()-1)=='e');
		list1.removeIf((x)->x.toLowerCase().endsWith("a") || x.endsWith("e"));
		int n2=sc.nextInt();
		for(int i=0;i<n2;i++)
		{
			String input=sc.next();
			list2.add(input);
		}
		
		list2.removeIf((x)->x.toLowerCase().endsWith("a") || x.endsWith("e"));
		//loop first list
		Iterator<String> it = list1.iterator();
//		while(it.hasNext())
//		{
//			String fruit = it.next();
//			fruit=fruit.toLowerCase();
//			if(fruit.charAt(fruit.length()-1)=='a' || fruit.charAt(fruit.length()-1)=='e' )
//			{
//				it.remove();
//			}
//		}
		
//		it=list2.iterator();
//		while(it.hasNext())
//		{
//			String fruit=it.next();
//			fruit=fruit.toLowerCase();
//			if(fruit.charAt(0)=='m' || fruit.charAt(0)=='a')
//			{
//				it.remove();
//				
//			}
//		}
		
		String output[]=new String[list1.size()+list2.size()];
		int i=0;
		for(String str : list1)
			output[i++]=str;
		
		for(String str:list2)
			output[i++]=str;
		
		for(String str : output)
		{
			System.out.println(str);
		}
	}

	
}
