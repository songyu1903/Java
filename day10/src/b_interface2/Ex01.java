package b_interface2;

class ClassA implements InterA{
	@Override
	public void method1() {
		InterA.super.method1();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		InterA.method2(); 

		ClassA a = new ClassA();
		a.method1();
	
	}
}
