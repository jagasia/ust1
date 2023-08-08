import java.util.Stack;

public class App2 {

	public static void main(String[] args) {
		Stack<Integer> marks=new Stack<>();
		marks.push(20);
		marks.push(30);
		marks.push(40);
		marks.push(50);
		marks.push(60);
		marks.push(70);
		marks.push(80);
		marks.push(90);
		
		System.out.println(marks.pop());
		System.out.println(marks.pop());
		System.out.println(marks.pop());
		System.out.println(marks.pop());
		System.out.println(marks.pop());
		System.out.println(marks.pop());
		System.out.println(marks.pop());
		System.out.println(marks.pop());
		
	}

}
