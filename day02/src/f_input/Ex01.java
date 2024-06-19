package f_input;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
//		ctrl + shift + o -> 자동 import

		// 참조 자료형
//		String str = "안녕";
//		자료형	    변수명          =    값(Scanner 클래스를 똑같이 복제한 값)
		Scanner scan/*변수이름*/ = new Scanner(System.in); // new는 인스턴스이다
		
		// 나의 정보
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("나이: ");
		int age = scan.nextInt();
		System.out.print("몸무게: ");
		float weight = scan.nextFloat();
		System.out.print("키: ");
		float higher = scan.nextFloat();
		System.out.println("|이름: " + name + " |나이 : " + age + "살 |몸무게: " + weight + "kg |키: " + higher + "cm");
		
	}

}
