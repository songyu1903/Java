package a_abstract;

// 추상 클래스
abstract class ClassA{
	int data;
	
	// 일반 메서드
	void method1() {}
	
	// 추상 메서드
	abstract void method2();
}

class ClassB extends ClassA{
	@Override
	// 부모에서 미완성된 method2를 자식에게 상속해 완성한다
	void method2() {
		System.out.println("오버라이딩 method2!!");
	}
	
}

abstract class ClassC{
	
}

public class Ex01 {

	public static void main(String[] args) {
//		추상클래스는 객체화가 불가능하다.
//		ClassA a = new ClassA();
		
		ClassB b = new ClassB();
		b.method2();
		
//		UpCasting	
		ClassA a = new ClassB();
		a.method2();
	}

}
