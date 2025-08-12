package invMgmt;

public class Electronics extends Product {
	int warantyYrs;
	public Electronics(String name,String productId, int warantyYrs) {
		super(name,productId );
		this.warantyYrs = warantyYrs;
	}
	

}
