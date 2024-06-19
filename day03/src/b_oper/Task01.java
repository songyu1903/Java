package b_oper;

import java.util.Scanner;

public class Task01 {
	/*
	 * 정수 2개를 입력받아서 큰 수를 출력하기
	 * 
	 * 입력)
	 * 정수1 입력 >> 20
	 * 정수2 입력 >> 10
	 * 
	 * 출력)
	 * 큰 수는 20입니다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수1 입력 >> ");
//		int num1 = sc.nextInt();
//		System.out.print("정수2 입력 >> ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("큰 수는: " + (num1 > num2 ? num1 : num2 ) + " 입니다");
		
//		 강사님 코드
		int num1 = 0 , num2 = 0; 
		String result = "";
		
		System.out.print("정수1 입력 >>");
		num1 = sc.nextInt();
		System.out.print("정수1 입력 >>");
		num2 = sc.nextInt();
		
//		result = num1 > num2 ? num1 : num2 ;
		result = num1 > num2 ? "큰 수 : " + num1 : 
        num1 == num2 ? "같다" : "큰 수 : " + num2;
		System.out.println(result);
		
		System.out.println("큰 수는 : " + result + "입니다");	
	}

}
