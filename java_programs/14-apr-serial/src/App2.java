import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class App2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//to read object from file
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("kalyan.dat"));
		Employee e=(Employee) ois.readObject();
		
		System.out.println(e);

	}

}
