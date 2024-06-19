package b_oper;

public class Ex03 {

	public static void main(String[] args) {
		// 조건식은 변수와 사용하는 경우가 많다
		int num1 = 10, num2 = 20;
		boolean isTrue = num1 >= 10; // true
		
		System.out.println(10 == 10);
		System.out.println(10 != 10);
		System.out.println(10 > 11);
		
		System.out.println(num1 == 10);
		System.out.println(num1 != num2);
		
		System.out.println(num1 > num2);
		System.out.println(num1 <= num2);
		
		System.out.println("===================================================");
		System.out.println(isTrue);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(isTrue || false);
		System.out.println(false || false);
		System.out.println("===================================================");
		
		System.out.println((num1 == 10) && (num2 <= 20));
		System.out.println(num1 != 10 || num2 > 10);
		
		System.out.println("===================================================");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!isTrue);
		System.out.println(!(num1 == 10));
	
	}

}
