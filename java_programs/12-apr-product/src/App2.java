import java.util.Arrays;

public class App2 {

	public static void main(String[] args) {
		Product []arr=new Product[5];
		arr[0]=new Product(5, "Pencil", 12.2, "Stationary");
		arr[1]=new Product(15, "Sharpner", 12.2, "Stationary");
		arr[2]=new Product(51, "Eraser", 12.2, "Stationary");
		arr[3]=new Product(115, "One Plus 11", 12.2, "Electronics");
		arr[4]=new Product(511, "Mi Tv 12", 12.2, "Electronics");

		Arrays.sort(arr);
		
		for(Product p : arr)
			System.out.println(p);
	}

}
