package ch03;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int res = calcSum();
		System.out.println(res);
		
		sayHello("yejin");
		int res1 = addNum(1, 2);
		System.out.println(res1);
	}

}
