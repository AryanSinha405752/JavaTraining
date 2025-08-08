package accessmodPac;


public class Application {
	public static void main(String[] args) {
		Child c=new Child();
		c.walk();//Public
		c.eat();//Protected
		c.run();//default
//		c.sleep();
		Parent p=new Parent();
		p.walk();
		p.eat();
		p.run();
		p.test();
	}

}
