package a_class;

// 메서드의 다형성
class ClassA {
	int data;
	String str;

	// 생성자 오버로딩
	public ClassA() {}
	// int 매개변수 1개
	public ClassA(int data) {
		this.data = data;
	}
	// String 매개변수 1개
	public ClassA(String str) {
		this.str = str;
	}
	// 매개변수 2개
	public ClassA(int data, String str) {
		this.data = data;
		this.str = str;
	}

	
// 메서드 오버로딩
	void print() { // 매개변수 0개
		System.out.println("ㅇㅇ");
	}

	void print(String str) { // 매개변수 1개
		System.out.println(str);
	}

	void print(int age) { // 매개변수가 위에랑 같이 1개이지만 자료형이 달라서 사용가능
		System.out.println(age);
	}

	void print(String str, String str2) { // 매개변수 2개
		System.out.println(str + str2);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		ClassA a = new ClassA();

		a.print();
		a.print("ㅇㅅㅇ");
		a.print(26);
		a.print("김송호 ", "장희재");
		
		ClassA a2 = new ClassA(26, "김송호");
		ClassA a3 = new ClassA(26);
		
		
	}
}
