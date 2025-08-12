package invMgmt;

import java.util.ArrayList;
import java.util.List;

public class Inventory <T extends Product>{
	List<T> inventory = new ArrayList<T>();
	public void addProduct(T product) {
		inventory.add(product);
	}
	public void listAllProducts() {
		for(T i: inventory) {
			System.out.println("Product name: "+i.name);
		}
	}
}
