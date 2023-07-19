import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App2 {

	public static void main(String[] args) {

		List<Integer> marks=new ArrayList<Integer>();
		marks.add(1);
		marks.add(2);
		marks.add(3);
		marks.add(4);
		marks.add(70);
		marks.add(92);
		marks.add(54);
		marks.add(90);
		marks.add(80);
		marks.add(50);
		
		ListIterator<Integer> it = marks.listIterator(marks.size());
//		while(it.hasNext())
//		{
//			Integer x = it.next();
////			System.out.println(x);
//		}
//		
//		System.out.println("Now, lets travers in reverse");
		
		while(it.hasPrevious())
		{
			Integer x = it.previous();
			System.out.println(x);
		}
	}

}
