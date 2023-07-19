import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class App2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//to read object from file
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("kalyan.dat"));
		Employee e=(Employee) ois.readObject();
		
		System.out.println(e);
		Date dt=null;
		int i=0;
		i=5/0;
		System.out.println(dt.getHours());
	}

}
