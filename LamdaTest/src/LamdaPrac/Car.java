
package LamdaPrac;

public class Car {
	String make, color, model;
	int price;
	public Car(String make, String model, String color, int price) {
		super();
		this.make = make;
		this.color = color;
		this.model = model;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", color=" + color + ", model=" + model + ", price=" + price + "]";
	}
	
	public void printCar() {
		System.out.println(this);
	}
}
