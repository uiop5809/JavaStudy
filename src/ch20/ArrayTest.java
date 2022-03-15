package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			total += arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("total:" + total);
	}

}
