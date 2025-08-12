package invMgmt;

public class Books extends Product{
	String author;

	public Books( String name,String productId, String author) {
		super(name,productId );
		this.author = author;
	}
}
