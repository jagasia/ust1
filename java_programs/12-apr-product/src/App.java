import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(5, "Pencil", 12.2, "Stationary"));
		productList.add(new Product(15, "Sharpner", 12.2, "Stationary"));
		productList.add(new Product(51, "Eraser", 12.2, "Stationary"));
		productList.add(new Product(115, "One Plus 11", 12.2, "Electronics"));
		productList.add(new Product(511, "Mi Tv 12", 12.2, "Electronics"));
		productList.add(new Product(25, "Scale", 12.2, "Stationary"));

		Collections.sort(productList);
		
		for(Product p: productList)
			System.out.println(p);
	}

}
