package b_lambda_task;

import java.util.Arrays;

import b_lambda.FunctionalInter3;

/*
 * [실습]
 * 
 * 2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메서드 (람다식)
 * FunctionalInter3 이용
 * 
 * 새로운 함수형 인터페이스(FuntionalInter4)를 만들고
 * 2개의 문자열을 매개변수로 전달받는 추상 메서드 (combineStirng)를 선언한다.
 * 람다식을 이용하여 2개의 문자열을 연결하여 출력하는 메서드 만들기
 * 
 * 예시)
 * "안녕" + "하세요" = 안녕하세요
 */

public class Task01 {
	public static void main(String[] args) {

		// 익명 클래스		
		FunctionalInter3 fi = new FunctionalInter3() {
			@Override
			public int addNumber(int a, int b) {
				return a * b;
			}
		};
		System.out.println(fi.addNumber(10, 3));

		// 람다식
		FunctionalInter3 fi3 = (num1, num2) -> {
			System.out.println("숫자1 : " + num1);
			System.out.println("숫자2 : " + num2);
			return num1 * num2;
		};
		System.out.println("숫자1 * 숫자2: " + fi3.addNumber(100, 200));

		System.out.println("==================");

		FuntionalInter4 fi4 = (st1, st2) -> {
			System.out.println("문자열1번 : " + st1);
			System.out.println("문자열2번 : " + st2);
			return st1 + st2;
		};
		System.out.println(fi4.combineString("안녕하세요", " 만나서 반갑습니다!!"));

		System.out.println("==================");

		FuntionalInter4 fii = (st1, st2) -> st1 + st2;
		System.out.println(fii.combineString("김송호 ♥", " 장희재"));

//		FuntionalInter4 fi1 = (st1, st2) -> System.out.println(st1, st2);
//		fi1.combineString("안녕", "하세요");

		Runnable r = () -> System.out.println("Runnable");
		r.run();
		
//		int[] ar = { 1, 2, 3, 4, 5 };
//
//		for (int i = 0; i < ar.length; i++) {
//			if (ar[i] % 2 == 0) {
//				System.out.println(ar[i] + 10);
//			}
//		}
//		Arrays.stream(ar)
//			.filter(i -> i % 2 == 0)
//			.map(i -> i + 10)
//			.forEach(System.out::println);

	}

}
