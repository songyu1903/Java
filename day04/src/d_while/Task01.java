package d_while;

import java.util.Scanner;

/*
 * 두 수의 곱을 구하는 프로그램 만들기
 * 두 수를 입력받아 곱을 출력한다.
 * 
 * 음수를 한 번이라도 입력하면 프로그램이 종료된다.
 * 
 * 예시)
 * 두 수를 입력 >> 2 3
 * 출력) 6
 *  두 수를 입력 >> 5 6
 * 출력) 30
 * 두 수를 입력 >> -1 3
 * [프로그램 종료]
 */

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("두 수를 입력 >> ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if (num1 < 0 || num2 < 0) {
				System.out.println("[프로그램 종료]");
				break;
			}
//			else if (num2 < 0) {				
//				System.out.println("[프로그램 종료]");
//				break;
//			}
			System.out.println("두 수의 곱: " + num1 * num2);
		}
	}

}
