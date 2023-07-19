
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
//		sb.append("India");
//		sb.append(" is our country");
//		sb.append(". We are in Kerala");
//		sb.append("Next year we will be in USA");
		sb.append("Welcome USA.");
		
		int startIndex=sb.indexOf("USA");
		sb.insert(startIndex, "to ");
		startIndex=sb.indexOf("USA");
		sb.replace(startIndex, startIndex+3, "UK");
		System.out.println(sb);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}

}
