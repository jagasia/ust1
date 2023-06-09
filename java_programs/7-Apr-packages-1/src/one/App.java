package one;

import one.Person;

public class App {

	public static void main(String[] args) {
		Person raja=new Person();
		raja.speak(); 	//public
		raja.walk(); 	//default
		raja.listen();	//protected = default + sub classes
//		raja.run();		//private
	}

}
