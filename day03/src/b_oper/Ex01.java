package b_oper;

import java.util.Scanner;

/*
 * 두 자릿수 정수를 입력받고 십의 자리, 일의 자리를 출력하는 프로그램 만들기
 * 
 * 입력)
 * 두 자릿수 정수 입력 >> 45
 * 
 * 
 * 출력)
 * 십의 자리는 4입니다.
 * 일의 자리는 5입니다.
 * 
 */

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 자릿수 정수 입력 >> ");
//		int inputNum = 0, result1 = 0, result2 = 0;
		int num = sc.nextInt();
		int result1 = 0;
		int result2 = 0;
				
//		inputNum = sc.nextInt();
		
		result1 = num / 10; // 몫
		result2 = num % 10; // 나머지
		System.out.println("십의 자리는 " + result1 + "입니다");
		System.out.println("일의 자리는 " + result2 + "입니다");
		
	}

}
