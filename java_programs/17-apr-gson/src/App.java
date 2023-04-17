import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
		Employee e1=new Employee(248825, "Ajay", "C M", "Ernakulam");
//		System.out.println(e1);
		//convert object to json string
		Gson gson=new Gson();
		String output=gson.toJson(e1);
		System.out.println(output);
	}

}
