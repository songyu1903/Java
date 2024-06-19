package b_lambda2;

@FunctionalInterface
interface Test {
	void run(); // 추상 메서드
}

public class Ex01 {
	public static void main(String[] args) {
		Test t1 = () -> System.out.println("tset 코드 실행!");
//		t1.run();

		startCode(t1);
		startCode(() -> System.out.println("안녕!!")); // 아래에 있는 startCode 매개변수에 t1을 전달

		Test test = returnLambda();
		test.run();
		
		returnLambda().run();
	}

	static Test returnLambda() {
//		Test t = () -> System.out.println("Hi!@@@@@@@@");
//		return t;

		return () -> System.out.println("Hi!@@@@@@@@@");

	}

//	Test t1 = () -> System.out.println("tset 코드 실행!");
	// 인터페이스 타입 Test를 t로 반환
	static void startCode(Test t) {
		t.run();
	}
}
