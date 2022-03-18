package ch09;

public abstract class NoteBook extends Computer {
	
	// 추상 메서드를 한 개만 정의
	@Override
	public void display() {
		System.out.println("NoteBook display");
	}
}
