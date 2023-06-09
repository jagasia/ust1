import java.util.ArrayList;

public class App1 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(50);
		marks.add(90);
		marks.add(60);
		marks.add(100);
		
//		System.out.println(marks.size());
//		System.out.println(marks);
		
		marks.remove(new Integer(100));
		
		for(int i=0;i<marks.size();i++)
		{
			System.out.println(marks.get(i));
			
		}
	}
//Task:	Create an array list of String and add country names
}
