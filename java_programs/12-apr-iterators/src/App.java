import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> marks=new ArrayList<Integer>();
		marks.add(90);
		marks.add(50);
		marks.add(80);
		marks.add(85);
		marks.add(70);
		marks.add(92);
		marks.add(54);
		marks.add(90);
		marks.add(80);
		marks.add(50);
		
		//there are several ways of accessing all elements of a collection
//		for(int i=0;i<marks.size();i++)
//		{
//			System.out.println(marks.get(i));
//		}
		
		//for each loop
//		for(Integer x:marks)
//		{
//			System.out.println(x);
//		}
		
		//how to use iterator?????
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext())
		{
			Integer x=it.next();
//			it.remove();		//removes the current element
			System.out.println(x);
		}
	}

}
