package colltest;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Animal o) {
		if(this.age>o.age) {
			return 1;
		}
		else if(this.age<o.age) {
			return -1;
		}
		return 0;
	}
	
}
