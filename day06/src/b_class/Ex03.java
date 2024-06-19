package b_class;

class ClassA{
	int data;
	
//	public ClassA(int data) {
//		this.data = data;
//	}
	
	void printThis() {
		System.out.println(this);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		
		System.out.println(a); // a라는 참조변수가 저장한 값은 객체의 주소(100번지)
		a.printThis();				// this를 출력하면 객체 자신의 주소 (100번지)
		
		a.data = 10;
	}
}









