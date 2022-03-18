package ch09;

public class MyNoteBook extends NoteBook{
	
	//NoteBook에서 구현 안 한 메서드 정의
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing");
	}
}
