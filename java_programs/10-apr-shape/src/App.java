abstract class Shape {

	public abstract float calculateArea();

}

class Circle extends Shape {
	public float calculateArea() {
		System.out.println("3.14 * r * r");
		return 0.0f;
	}
}

class Rectangle extends Shape {
	public float calculateArea() {
		System.out.println("l * b");
		return 0.0f;
	}
}

class Triangle extends Shape {
	public float calculateArea() {
		System.out.println("0.5 * b * h");
		return 0.0f;
	}
}

public class App {
	public static void main(String []args){
		Shape s;
		s=new Circle();
		s.calculateArea();		//3.14 * r * r
//		error! because, "calculateArea" method is not defined in the Shape class.

		s=new Rectangle();
		s.calculateArea();		//l * b

		s=new Triangle();
		s.calculateArea();		//0.5 * b * h

	}
}

