
public class App3 {

	public static void main(String[] args) {
		SuperStar ss = SuperStar.getInstance();
		ss.setName("Mohan Lal");
		
		SuperStar ss2 = SuperStar.getInstance();
		ss2.setName("Mammooty");
		
		System.out.println(ss.getName());
	}

}
