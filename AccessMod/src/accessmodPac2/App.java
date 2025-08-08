package accessmodPac2;

import accessmodPac.Parent;

public class App {
	public static void main(String[] args) {
		Child2 c=new Child2();
		c.walk();//Public
//		c.eat();//Protected
		c.test();//So in java the subclass from another package can only access the parent/super class protected methods through inheritance and through a method call.
//		c.run();//default
//		c.sleep();//Private
		Parent p=new Parent();
		p.walk();
		
	
	}
}
