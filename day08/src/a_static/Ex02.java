package a_static;

class B{
	int iVar;
	static int sVar;
	
//	static 붙은 메서드 : static 메서드, 정적 메서드
//	안붙은 메서드 : 인스턴스 메서드
	
//	인스턴스 메서드는 인스턴스, static 멤버를 모두 사용 가능하다. 
	void iMethod1() {
		iVar = 10;
		sVar = 10;
		iMethod2();
		sMethod2();
	}
	void iMethod2() {}
	
//	static 메서드는 static 멤버만 사용 가능하다.
	static void sMethod1() {
//		iVar = 10; 
		sVar = 10;
//		iMethod2(); 불가능
		sMethod2();
	}
	
	static void sMethod2() {}
}


public class Ex02 {
	public static void main(String[] args) {
		System.out.println("시작");
		B.sVar = 10;
		B.sMethod1();
		
		B b = new B();
		b.iVar = 20;
		b.iMethod1();
		
		
		System.out.println("종료");
	}

}
