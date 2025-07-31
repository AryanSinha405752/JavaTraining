package LamdaPrac;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				);
		condition(cars,(c)-> "Car: "+c.getMake()+" "+c.getModel());  //Function
//		condition(cars,(c)-> System.out.println(c));		//Consumer
//		condition(cars,(c)-> c.getColor().equals("Red"));  //Predicate
	}
	
//	public static void condition(List<Car> cars,Consumer<Car> con) {
//		for(Car c: cars) {
//			con.accept(c);
//		}
//	}
	public static void condition(List<Car> cars,Function<Car,String> con) {
		for(Car c: cars) {
			System.out.println(con.apply(c));
		}
	}
//	public static void condition(List<Car> cars,Predicate<Car> con) {
//		for(Car c: cars) {
//			if(con.test(c)) {
//				c.printCar();
//			}
//		}
//	}
	
}





