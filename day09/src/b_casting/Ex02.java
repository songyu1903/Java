package b_casting;

class A{
	
}

class B extends A{
	
}

public class Ex02 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof A); // instaceof
		System.out.println(a instanceof B); // instaceof
		System.out.println(b instanceof A); // instaceof
		System.out.println(b instanceof B); // instaceof
		
		A aa = new B();
//		B bb = new A();
	}

}
