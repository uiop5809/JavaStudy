package ch18;

public class Car {
	
	private static int SerialNum = 10000;
	private int CarNum;
	
	public static int getSerialNum() {
		return SerialNum;
	}
	public int getCarNum() {
		return CarNum;
	}
	public void setCarNum(int CarNum) {
		this.CarNum = CarNum;
	}
	
	public Car() {
		SerialNum++;
		CarNum = SerialNum;
	}
}
