package invMgmt;


public class Application {
	public static void main(String[] args) {
		Inventory<Electronics> i1=new Inventory<>();
		Inventory<Books> i2=new Inventory<>();
		i1.addProduct(new Electronics("Mobile", "21bai1341", 2));
		i2.addProduct(new Books("Harry Potter", "21BAI1215", "J K Rowling"));
		i1.listAllProducts();
		i2.listAllProducts();
	}
}
