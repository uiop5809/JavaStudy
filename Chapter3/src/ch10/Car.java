package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void tunrOnCar() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} 
	// 구현부가 있지만, 구현은 안 된 메서드 (필요한 경우에 재정의) 훅 메서드
	
	final public void run() {
		tunrOnCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
