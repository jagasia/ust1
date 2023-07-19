
public class App {

	public static void main(String[] args) {
		int i=1_2;
		System.out.println(i);
		String str="today is monday.";
		String result = str.replaceAll("\\.", ",");
		System.out.println(str);
		System.out.println(result);
		
		str.matches("[01]+");
		
		StringBuilder sb=new StringBuilder(str);
		
	}

}
