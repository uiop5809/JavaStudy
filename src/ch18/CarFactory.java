package ch18;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	
	public CarFactory() {
	}
	
	public Car createCar() {
		return new Car();
	}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
}
