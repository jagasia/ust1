import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedInputStream bis=new BufferedInputStream(System.in);
		
		
		String str=br.readLine();
		System.out.println(str);
	}

}
