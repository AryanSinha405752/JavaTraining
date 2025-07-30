package enumpac;

public class Testing {

		color c;
		public Testing(color cl) {
			c=cl;
		}
		public void check() {
			switch(c) {
			case red:
				System.out.println("RED");
				System.out.println("Wow");
				break;
			case green:
				System.out.println("Blue");
				break;
			case blue:
				System.out.println("Green");
				break;
			case yellow:
				System.out.println("Yellow");
				break;
			default:
				System.out.println("OOps");
				break;
				
			}
				
		}
}
