package two;

import one.Person;

public class Student extends Person {
	public void method()
	{
		speak();	//public 
//		walk();		//default	error
		listen();	//protected
//		run();		//private	error
	}
}
