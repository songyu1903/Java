package a_static;

class A{
//	필드의 종류
//	static이 붙은 필드 : static 필드, 클래스 필드, 정적 필드
//	static이 안붙은 필드 : 인스턴스 필드
	int iVar;
	static int sVar;
}

public class Ex01 {
	public static void main(String[] args) {
		A a = new A();
		
		a.iVar = 10;
		A.sVar = 20; // 처음 20으로 저장을 했다
		
//		static 필드는 프로그램이 실행되면 미리 저장공간이 생성된다. ( 딱 1개만 )
//		그러므로 모든 객체는 static 필드를 공유해서 사용한다.
		
		A a2 = new A();
		
		a2.iVar = 100;
		A.sVar = 200; // static인 sVar는 저장공간이 하나여서 20 -> 200으로 숫자를 저장
		
		System.out.println(a.iVar);
		System.out.println(a.sVar); // a.sVar = 20 이지만 -> static 이여서 a2.sVar = 200 으로 저장을해서 200이 나옴
		System.out.println(a2.iVar);
		System.out.println(a2.sVar); // 위랑 마찬가지로 마지막으로 저장했던 값이 200이여서 200이 나옴
	}
}
