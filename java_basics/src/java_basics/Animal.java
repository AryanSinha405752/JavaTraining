package java_basics;

public class Animal {
	int age;
	String gen;
	int w;
	
	public Animal(int a,int we,String g) {
		age=a;
		gen=g;
		w=we;
	}
	public void eat() {
		System.out.println("Eating");
	}
	public void sleep() {
		System.out.println("Sleeping");
	}
	
}
