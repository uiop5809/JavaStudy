package ch09;

public class Desktop extends Computer{
	// 추상 클래스 정의
	@Override
	public void display() {
		System.out.println("Desktop display");
	}
	
	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	
	// 상위 클래스 재정의
	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
}
