package b_inheritance;

class Parents{ // 부모 클래스
	int number;
	
	public Parents() { // 부모 생성자
		System.out.println("Parents 생성자 호출!");
	}
}

class Child extends Parents{ // 자식 클래스 에 부모 클래스를 확장
	int data;
	
	
	// this 는 자신의 생성자
//	public Child(int data) {
//		super(); // 부모의 생성자
//		this.data = data;
//	}


	public Child() { // 자식 생성자
		super();  // super()는 부모의 생성자를 의미
				  // 개발자가 생략해도 자동으로 만들어진다
		System.out.println("Child 생성자 호출!");
		this.number = 10;
	}
}

public class Ex02 extends Child{
	public static void main(String[] args) {
//		Parents p = new Parents();
		Child ch = new Child();
		
	}

}
