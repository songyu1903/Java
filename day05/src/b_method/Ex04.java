package b_method;

public class Ex04 {

	public static void main(String[] args) {
		int num = addNumber(10, 20);
		System.out.println(addNumber(10, 20));
		System.out.println(num);
	}
	static int addNumber(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

}
