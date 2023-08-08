
public class StringDemo1 {

	public static void main(String[] args) {
//		String str1="hello";
//		String str2="hello";
		String str="hello";
		String str1=new String("hello");
		String str2=new String("hello");
		
//		int i=20;
//		int j=22;
//		
//		System.out.println(i==j); 			//  == operator compares the values, if the operands are value types.
		System.out.println(str1==str2);		//	== operator compares the references, if the operands are reference types.
		System.out.println(str1.equals(str2));
	}

}
