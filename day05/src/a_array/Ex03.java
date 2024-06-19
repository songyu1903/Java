package a_array;

public class Ex03 {

	public static void main(String[] args) {
		int[] arData = new int[10];

		for (int i = 0; i < arData.length; i++) { // arData.length -> 배열이 10칸이다
			arData[i] = i + 1;
		}
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
	}

}
