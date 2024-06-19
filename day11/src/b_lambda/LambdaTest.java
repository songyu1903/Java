package b_lambda;


public class LambdaTest {
	/*
	 * 람다식은 메서드롤 식으로 표현하는 것
	 * 람다식은 익명 메서드 라고도 부른다.
	 */
	
	
	void printHello() {
		System.out.println("안녕하세요!");
	}
	
	/*
	 * void printHello() { System.out.println("안녕하세요"); } // 우선 한줄로 바꾼다
	 * void () -> { System.out.println("안녕하세요"); } // 이름을 없애고 -> 를 추가한다.
	 * () -> { System.out.println("안녕하세요"); } // 반환타입은 추론이 가능하므로 생략한다. 
     * () -> System.out.println("안녕하세요") 		// 명령문이 1줄이면 중괄호와 세미콜론을 생략 가능하다 (선택)
	 */ 

	int add10(int num) {
		return num + 10;
	}
	/*
	 * int add10(int num) { return num + 10; }
	 * int (int num0) -> { return num + 10; }
	 * (int num0) -> { return num + 10; }
	 * (num0) -> { return num + 10; } 	// 매개변수 타입은 추론이 가능하므로 생략한다.
	 * 
	 * (num0) -> { return num + 10; }   // 매개변수가 1개라면 () 를 생략 가능하다(선택)
	 * 
	 * num -> num + 10 // 중괄호와 세미콜론을 생략 가능하다(선택)
	 * 				   // 중괄호와 세미콜론을 생략하면 return 도 생략해야하다(선택)
	 * 				   // 오른쪽(바디) 결과가 깂이라면 자동으로 return 한다.
	 * 				   // 단, 바디에 식이 1줄인 경우에만 가능하다.
	 * 
	 */
	
//	int addNumber(int num1, int num2) {
//		System.out.println(num1 + num2);
//		return num1 + num2;
//	}
	
	/*
	 * (num1, num2) -> {}
	 * 매개변수가 2개 이상이므로 () 생략 불가
	 * 명령어가 2개 이상이므로 {}와 ; 생략 불가
	 * {}와 ; 을 생략하지 못했으므로 return 생략 불가
	 */
	
	


}
















