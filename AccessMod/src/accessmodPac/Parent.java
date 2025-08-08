package accessmodPac;


public class Parent {
	public void walk() {
		System.out.println("Parent Walking");
	}
	void run() {
		System.out.println("Parent running");
	}
	protected void eat(){
		System.out.println("Parent eating");
	}
	private static void sleep(){
		System.out.println("Parent sleeping");
	}
	
	public void test(){
		sleep();
	}
	public static void main(String[] args) {
		sleep();
	}
}
