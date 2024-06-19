package d_anonymous;

public class Ex01 {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.printData();
		
//		익명클래스(Anonymous Class)
//		이름이 없는 클래스이다.
//		일회성으로 객체를 생성하기 위해 사용한다.
		
//		class 이름 implements InterA{
		
		ClassA a1 = new ClassA();
		
		a1.print2();
		a1.printData();
		
		InterA a = new InterA() { // classA implements InterA 가 자동으로 붙는다
			@Override
			public void printData() {
				System.out.println("익명 클래스 오버라이딩!!"); 
				
			}
			@Override
			public void print2() {
				System.out.println("print2");
			}
		};
		
		a.printData();
		a.print2();
	}
}
