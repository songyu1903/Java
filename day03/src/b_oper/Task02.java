package b_oper;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * 다음 중 음식이 아닌 것은?
		 * 1. 케이크
		 * 2. 파스타
		 * 3. JAVA
		 * 4. 피자
		 * 
		 * 입력 >> 4
		 * 
		 * 출력)
		 * 오답입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 중 동물이 아닌 것은: ");
		System.out.println("1. 고양이 ");
		System.out.println("2. 강아지 ");
		System.out.println("3. 앵무새 ");
		System.out.println("4. 치킨 ");
		
		System.out.println("입력 >> ");
		int animal = sc.nextInt();
		
		System.out.println(animal == 4 ? "정답입니다." : "오답입니다");
		
		// 강사님 코드
//		String quizMsg ="""
//				다음 중 동물이 아닌 것은:
//				1. 고양이
//				2. 강아지
//				3. 앵무새
//				4. 치킨
//				
//				입력 >>
//				""";
//		int animal = 0;
//		String resultMsg = "";
//		final int ANSWER = 4;
//
//		System.out.print(quizMsg);
//		animal = sc.nextInt();
//
//		// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★
//		resultMsg = animal == ANSWER ? "정답입니다" : 
//			animal >= 1 && animal <= 4 ? "오답입니다" : "잘못 입력하셨습니다"; 
//		System.out.println(resultMsg);
	}

}
