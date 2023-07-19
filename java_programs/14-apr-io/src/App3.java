import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App3 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\rjaga\\Pictures\\paratta.jpg");
		int len=(int) f.length();
		byte []data=new byte[len];
		
		FileInputStream fis=new FileInputStream(f);
		fis.read(data);
		fis.close();
		//--------------------
		//write these bytes to a new file
		FileOutputStream fos=new FileOutputStream("ajay.jpg");
		fos.write(data);
		fos.close();
		System.out.println("Pls check ajay.jpg");
		
	}

}
