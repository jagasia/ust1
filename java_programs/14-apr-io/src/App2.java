import java.io.File;
import java.util.Date;

public class App2 {

	public static void main(String[] args) {
		File f = new File("D:\\Jag");
		
		Date dt=new Date(f.lastModified());
		System.out.println("This folder was last modified on "+dt);
		String[] arr = f.list();
		for (String s : arr)
			System.out.println(s);
	}

}
