import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App6 {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("kalyan.dat"));
		dos.writeInt(101);
		dos.writeFloat(2.5f);
		dos.writeChars("Kalyan");
		dos.flush();
		dos.close();
		System.out.println("Done");
	}
}
