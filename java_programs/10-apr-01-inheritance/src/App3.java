
public class App3 {

	public static void main(String[] args) {
		new Person() {
			
			@Override
			public void speak() {
				// TODO Auto-generated method stub
				System.out.println("Speak method is called");
			}
		}.speak();
	}

}
