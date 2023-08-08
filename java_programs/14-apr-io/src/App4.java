import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("C:\\Users\\rjaga\\Pictures\\paratta.jpg");
		FileInputStream fis=new FileInputStream(f);
		
		FileOutputStream fos=new FileOutputStream("sidharth.jpg");
		int i=-1;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
			fos.flush(); 	//discuss
			Thread.sleep(200);
		}
		
		fis.close();
		fos.close();
		System.out.println("Done");
	}

}
