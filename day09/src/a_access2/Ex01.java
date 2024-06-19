package a_access2;

import a_access.ClassA; // import 해서 ClassA 를 사용 가능하게함

class Child extends ClassA{
	public Child() {
		this.var1 = 1;
		this.var3 = 3; // class Child 를 ClassA 를 상속받아 protected 인 var3 를 사용 가능하게함
	}
}

public class Ex01 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		
		
	}

}
