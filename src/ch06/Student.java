package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() { 
		//default 생성자는 생성자가 하나도 없을 때 만들어짐
		//필요할 경우 직접 생성하기
	}
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년입니다.";
	}
}
