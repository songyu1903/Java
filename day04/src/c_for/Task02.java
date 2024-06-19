package c_for;

import java.util.Scanner;

/*
 * 두 수의 곱을 구하는 프로그램 만들기
 * 반복한 숫자를 입력받고
 * 두 수를 입력받아 곱한다.
 * 
 * 
 * 입력)
 * 반복 수 >> 3
 * 
 * 곱할 수 >> 5 3
 * 출력) 15
 * 
 * 곱할 수 >> 2 3
 * 출력) 6
 * 
 * 곱할 수 >> 1 3
 * 출력) 3
 */

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		int rep = 0;

		System.out.print("반복 수 >> ");
		rep = sc.nextInt();

		for (int i = 0; i < rep; i++) {
			System.out.print("곱할 수 >> ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.println(num1 * num2);
		}

	}

}
