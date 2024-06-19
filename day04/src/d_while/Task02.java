package d_while;
/*
 * 양의 정수를 입력받는다.
 * 
 * 입력받은 값에 7씩 빼서 -10이하로 떨어지는 수를 만들려면 몇 번 반복해야하는지
 * 출력하는 프로그램 만들기
 * 
 * 입력)
 * 양의 정수 입력 >> 10
 * 
 * 출력)
 * 3
 */

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 >> ");
		int num = sc.nextInt();
		int count = 0;
		
		while(num > -10) {
			num -= 7;
			count++; 
		}	
		System.out.println("반복 횟수: " + count);
	// 강사님	
		System.out.print("정수 입력 >> ");
		int number = sc.nextInt();
		int cnt = 0;
		while(true) {
			number -= 7;
			cnt++;
			
			if(number < -10) break;
		}
		System.out.println(cnt);
	}		
	
}
