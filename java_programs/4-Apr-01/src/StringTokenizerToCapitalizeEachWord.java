import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerToCapitalizeEachWord {

	public static void main(String[] args) {
		String input=new Scanner(System.in).nextLine();
		StringTokenizer st=new StringTokenizer(input, " ");
		String output="";
		boolean isFirst=true;
		while(st.hasMoreTokens())
		{
			String word = st.nextToken();
//			System.out.println(word);
			//get the first letter of the word 
			char firstLetter=word.charAt(0);
			//convert it to upper case
			firstLetter=Character.toUpperCase(firstLetter);
			
			String remaining=word.substring(1);
			String newWord=firstLetter+remaining;
//			System.out.println(newWord);
			if(!isFirst)
			{
				output+=" ";				
			}
			isFirst=false;			
			output+=newWord;
		}
		System.out.println(output);
	}

}
