import java.util.Collections;
import java.util.LinkedList;

public class App1 {

	public static void main(String[] args) {
		LinkedList<Integer> marks=new LinkedList<>();
		marks.add(20);
		marks.add(50);
		marks.add(40);
		marks.add(15);
		marks.add(22);
		marks.add(32);
		marks.add(28);
		marks.add(99);
		marks.add(56);
		
		Collections.sort(marks);
		System.out.println(marks);
	}

}
