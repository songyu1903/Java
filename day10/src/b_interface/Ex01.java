package b_interface;

class ClassB{
	void method4() {
		System.out.println("method4() 실행!");
	}
}

// 인터페이스는 다중 구현이 가능
// 인터페이스는 상속과 구현이 같이 가능하다
class ClassA extends ClassB implements InterA, InterB{

	@Override
	public void method1() {
		System.out.println("aa");
	}

	@Override
	public void method2() {
		System.out.println("bb");
	}
	@Override
	public void method3() {
		System.out.println("cc");
	}
	@Override
	public void method5() {
		System.out.println("method5() 실행!");
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
//		InterA a = new InterA();
		ClassA a = new ClassA();
		a.method1();
		a.method2();
		a.method3();
		
//		UpCasting
		InterA inter = new ClassA();
		inter.method1();
		inter.method2();
		
		InterB b = new ClassA();
		b.method3();
		b.method5();
		
		InterC c = new ClassA();
		c.method5();
		
		System.out.println(InterA.VAR1);
		System.out.println(ClassA.VAR2);
		
	}
}
