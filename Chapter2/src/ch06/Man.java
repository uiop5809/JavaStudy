package ch06;

public class Man {
	public int cm;
	public int kg;
	public String name;
	public int age;
	
	public Man(int cm, int kg, String name, int age) {
		this.cm = cm;
		this.kg = kg;
		this.name = name;
		this.age = age;
	}
	
	public String ManInfo() {
		return "키가 " + cm + " 이고 몸무게가 " + kg + " 킬로인 남성이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.";
	}
}
