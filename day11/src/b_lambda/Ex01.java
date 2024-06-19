package b_lambda;

import java.nio.file.spi.FileSystemProvider;

// ★ 람다 클래스 ★
public class Ex01 {
	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		FunctionalInter fi1 = new FunctionalInter() {
			// 재정의
			@Override
			public void method() {
				System.out.println("익명 클래스의 메서드 재정의");
			}
		};
		fi1.method();
		a1.method();
//		람다식 () -> ...
		FunctionalInter fi2 = () -> System.out.println("람다식으로 재정의");
		
		fi2.method();
		
	
		FunctionalInter2 fii = num -> num + 10;
		int result = fii.add10(90);
		
		System.out.println(result);
		System.out.println(fii.add10(80));
		
		FunctionalInter3 fi3 = (num1, num2) -> num1 + num2;
		System.out.println(fi3.addNumber(10, 20));
		
		FunctionalInter3 fii3 = (num1, num2) -> {
			System.out.println("num1 : " + num1);
			System.out.println("num2 : " + num2);
			return num1 + num2;
		};
		
		System.out.println( fii3.addNumber(100, 200));
	}
}
