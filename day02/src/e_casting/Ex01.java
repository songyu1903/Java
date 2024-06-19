package e_casting;

public class Ex01 {
	public static void main(String[] args) {
//		형변환(type casting)
//		1. 강제 형변환 : (자료형)값
//		2. 자동 형변환 : 알아서 형변환을 한다.
//		 - 작은 byte의 값을 큰 byte의 변수에 저장할 때 자동 형변환 된다.
//		 - 정수 + 정수 = 정수
//		 - 정수 + 실수 = 실수
//		 - 문자는 정수로 자동 형변환 된다.
		
		
//		정수 -> 정수
		int num1 = (int)3L; // 강제 형변환
		long num2 = 3; // 자동 형변환 -> int 4byte long 8byte 
		
//		실수 -> 실수
		float num3 = (float)3.14; // 강제 형변환
		double num4 = 3.14f; // 자동 형변환

//		정수 -> 실수
		float number1 = 3123123321L;
		double number2 = 123123L; // 자동 형변환
		
//	 	실수 -> 정수
		int number3 = (int)3.0f; // 강제 형변환
		long number4 = (long)3.14;
		
		System.out.println(10/3); // 정수 / 정수 = 정수
		System.out.println(10/3.0); // 정수 / 실수 = 실수
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
	}
}
