package ch09;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
		// 추상 클래스는 new 해줄 수 없음 (상속을 하기 위한 클래스)
		// Computer computer = new Computer();
		desktop.display();
	}
}
