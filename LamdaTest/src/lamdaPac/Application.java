package lamdaPac;

public class Application {
	public static void main(String[] args) {
		Human tom =new Human();
		Robot walle=new Robot();
//		tom.walk();
//		walle.walk();
//		walker(tom);
//		walker(walle);
//		walker(()-> System.out.println("Object walking"));
//		div d= (int a,int b)-> {
//			if(b==0) {
//				return 0;
//			}
//			return a/b;
//		};
//		System.out.println(d.compute(4, 2));
		strin revstr=(String s)->{
			String str="";
			for(int i=s.length()-1;i>=0;i--) {
				str=str+s.charAt(i);
			}
			return str;
		};
		System.out.println(revstr.reve("Hello"));
		
	}
	public static void walker(Walkable w) {
		w.walk();
	}
	public int nonzerodiv(int a,int b) {
		if(b==0) {
			return 0;
		}
		return a/b;
	}
}

interface div{
	public int compute(int a, int b); 
}
interface strin{
	public String reve(String s); 
}