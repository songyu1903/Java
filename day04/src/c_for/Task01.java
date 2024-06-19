package c_for;

public class Task01 {

	public static void main(String[] args) {
//		for문 사용
//		1 ~ 100 까지 출력
//		100 ~ 1 까지 출력
//		1 ~ 100까지 중 짝수만 출력
//		구구단 3단 출력
//		3 X 1 = 3
//		3 X 2 = 6
//		...
//		3 X 9  = 27

//		A ~ F 까지 출력

		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1);
		}
		System.out.println("=========================");
		for (int i = 0; i < 100; i++) {
			System.out.println(100 - i);
		}
		System.out.println("=========================");
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
		System.out.println("=========================");
		int dan = 3;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		System.out.println("=========================");
		char stchar = 'A'; // 아스키 코드로 인한 기계어
		char endchar = 'Z';
		for (char ch = stchar; ch <= endchar; ch++) {
			System.out.println(ch);
		}

//		aBcDeFgHiJkLmNoP.....Z  출력
//		char ch = 'a';
//		for (int i = 0; i < 26; i++) {
//			System.out.print(ch++);
//			if (i % 2 == 0) {
//				ch -= 32;
//			}
//		}
//		강사님
		for (int i = 0; i < 26; i++) {
			char alpha = (char) (i % 2 == 0 ? i + 'a' : i + 'A');
			System.out.print(alpha);
		}
		System.out.println();

		for (int i = 'a'; i <= 'Z'; i++) {
			char alpha1 = (char)(i % 2 == 0 ? i - 32 : i);
			System.out.print(alpha1);
		}
	}

}
