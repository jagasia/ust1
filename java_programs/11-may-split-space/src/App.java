
public class App {

	public static void main(String[] args) {
//		String str="This word has five words";
		String str="India";
		String[] arr = str.split(" ");
//		System.out.println(arr.length);
		if(arr.length>1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(str.charAt(0)+" and "+str.charAt(str.length()-1));
		}
	}

}
