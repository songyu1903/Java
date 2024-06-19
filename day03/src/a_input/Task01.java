package a_input;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * 두 정수를 입력받고 합을 출력하기
		 * next()를 사용한다.
		 * 
		 * 입력)
		 * 정수1 입력 >> 10
		 * 정수2 입력 >> 20
		 * 
		 * 출력)
		 * 두 정수의 합은 30입니다.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 입력 >> ");
		int num1 = scan.nextInt(); // 입력받은 값을 정수(int)로 가져온다
		System.out.print("정수2 입력 >> ");
		int num2 = scan.nextInt();
		
//		int num3 = Integer.parseInt(num1);
//		int num4 = Integer.parseInt(num2);
//		System.out.printf("두 정수의 합은 : %s", num3 + num4);
		System.out.println("두 정수의 합은 : " + (num1 + num2));
	}

}
