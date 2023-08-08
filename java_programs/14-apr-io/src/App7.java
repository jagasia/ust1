import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class App7 {

	public static void main(String[] args) throws IOException
	{
		//read primitives from a file
		DataInputStream dis=new DataInputStream(new FileInputStream("kalyan.dat"));
		float f=dis.readFloat();
		int i=dis.readInt();		
		String s=dis.readLine();
		System.out.println(i);
		System.out.println(f);
		System.out.println(s);
		
	}

}
