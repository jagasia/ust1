import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 {

	public static void main(String[] args) {
		String input="P@$$w0rd";
		StringBuilder sb=new StringBuilder(input);
		Pattern p = Pattern.compile("[0-9A-Za-z]+");
		Matcher m = p.matcher(input);
		while(m.find())
		{
			System.out.println(m.group());
			int index=sb.indexOf(m.group());
			int length=m.group().length();
			System.out.println(index+" to "+(index+length));
			sb.delete(index, (index+length));
		}
		System.out.println("Result="+sb.toString());		
	}

}
