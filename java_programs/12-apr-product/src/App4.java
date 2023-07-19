import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(5, "Pencil", 12.2, "Stationary"));
		productList.add(new Product(15, "Sharpner", 12.2, "Stationary"));
		productList.add(new Product(51, "Eraser", 12.2, "Stationary"));
		productList.add(new Product(115, "One Plus 11", 12.2, "Electronics"));
		productList.add(new Product(511, "Mi Tv 12", 12.2, "Electronics"));
		productList.add(new Product(25, "Scale", 12.2, "Stationary"));

		int choice = 0;
		do {
			System.out.println(
					"1) sort by id\r\n" + "2) sort by name\r\n" + "3) sort by price\r\n" + "4) sort by category");

			choice = sc.nextInt();
			switch (choice) {
			case 1: // id
				Collections.sort(productList);
				break;
			case 2: // name
				Collections.sort(productList, new ProductNameComparator());
				break;
			case 3: // price
				Collections.sort(productList, new ProductPriceComparator());
				break;
			case 4: // category
				Collections.sort(productList, new ProductCategoryComparator());
				break;
			}

			for (Product p : productList)
				System.out.println(p);
		} while (choice < 5);
	}

}
