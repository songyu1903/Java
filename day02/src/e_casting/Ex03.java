package e_casting;

public class Ex03 {

	public static void main(String[] args) {
//		문자열의 형변환
		int num1 = 10, num2 = 20;
		String number1 = "10", number2 = "20";
		
		System.out.println(num1 + num2); // 연산
		System.out.println(number1 + number2); // 문자열은 연결
		
//		연결의 결과는 문자열이다.
		String number3 = number1 + number2;
		
		System.out.println(num1 + number2); // 연결
		
		System.out.printf("제 나이는 %d 살입니다.\n",num1);
		System.out.println("제 나이는 " + num1 + "살입니다");
		
		System.out.println("두 수의 합은: " + num1 + num2 + "입니다");
		System.out.println("두 수의 합은: " + (num1 + num2) + "입니다");
		
		String str = ""; // 빈 문자열
		String number4 = num1 + "";
		System.out.println(number4);
	}

}
