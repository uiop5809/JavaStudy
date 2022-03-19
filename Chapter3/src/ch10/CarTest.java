package ch10;

public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println();
		
		Car maualCar = new MaualCar();
		maualCar.run();
		
	}

}
