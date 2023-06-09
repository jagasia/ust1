import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) throws IOException {
		//get inputs from the user
		Scanner sc=new Scanner(System.in);
		String detail=sc.nextLine();
		//create an object of Employee from a CSV
		String[] arr = detail.split(",");
		Employee emp=new Employee();
		emp.setId(Integer.parseInt(arr[0]));
		emp.setFirstName(arr[1]);
		emp.setLastName(arr[2]);
		emp.setLocation(arr[3]);
		
		//lets write this object to a file
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("kalyan.dat"));
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		System.out.println("Done");
	}

}
