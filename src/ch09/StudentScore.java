package ch09;

public class StudentScore {

	public static void main(String[] args) {
		
		Student park = new Student(21219, "박예진");
		park.setKoreaSubject("국어", 80);
		park.setMathSubject("수학", 50);
		
		park.showScoreInfo();
	}

}
