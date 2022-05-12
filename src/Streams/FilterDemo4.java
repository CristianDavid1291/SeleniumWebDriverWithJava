package Streams;

import java.util.Arrays;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class FilterDemo4 {

	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(new Product(1, "Ipad", 865.3), new Product(2, "AppleWatch", 265.5),new Product(3, "MacBookPro", 2000.0));
		products.stream().forEach(p->System.out.println(p.price));

	}

}
