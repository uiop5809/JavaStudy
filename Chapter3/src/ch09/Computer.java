package ch09;

public abstract class Computer {
	// 공통으로 구현할 수 없으면 하위 클래스에게 책임 위임(추상 메서드)
	public abstract void display();
	public abstract void typing();
	
	// 공통으로 구현할 수 있는 것만 메서드 정의
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원은 끕니다.");
	}

}
