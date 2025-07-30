package enumpac;


enum color{
	red,blue,green,yellow;
	
	
}


public class Application {
//	enum color{
//		red,blue,green,yellow;
//	}
	
	
	public static void main(String[] args) {
		color c;
		c=color.red;
		Testing t=new Testing(c);
		t.check();
		
	}
}
