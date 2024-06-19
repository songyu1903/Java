package a_variable;

public class Ex03 {

	public static void main(String[] args) {
//		변수명 규칙
//		변수명은 문자부터 시작
//		int a1; (o)
//		int 1a; (x)
		
//		특수문자를 사용할 수 없다. (단, _와 $는 가능)
//		int *a*; (x)
//		int _a;  (o)
		
//		공백을 사용할 수 없다.
//		int a b; (x)
		
//		키워드(예약어)를 사용할 수 없다.
//		int public; (x)
		
//		되도록 소문자로 시작하자(대소문자를 구분한다.) -> 클래스 때문에 소문자로
		int num, Num;
		
//		되도록 의미 없는 문자를 사용하지 않는다.
		int a = 10;
		int age = 10;
		float height = 171.5f; 
		
//		되도록 한글은 사용하지 않는다 (의도치않은 오류 떄문에).
		int 나이 = 10;
		System.out.println(나이);
		
//		user_age : 스네이크 표기법, 팟홀 표기법
//		userAge : 카멜 표기법 (권장)
		int userAge = 10;
	}

}








