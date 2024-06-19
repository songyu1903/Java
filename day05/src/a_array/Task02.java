package a_array;

import java.util.Scanner;

/*
 * 입력 횟수 n을 입력받는다. 
 * n개의 정수를 추가로 입력받는다.
 * 찾을 숫자 k를 입력받는다.
 * n개의 정수 중 k가 몇 개 있는지 출력한다.
 * 
 * 입력 예시)
 * 입력 횟수 >> 5
 * 5개의 정수 입력 >> 1 3 1 5 1
 * 찾을 정수 >> 1
 * 
 * 출력 예시)
 * 1은 총 3개 있습니다.
 * 
 */

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 횟수 >> ");
		int num  = sc.nextInt();
		System.out.println("================");
		System.out.print(num + "개의 정수 입력 >> ");
		int[] numbers = new int[num];
		
		for(int i = 0; i < num; i++) {
			numbers[i] = sc.nextInt();
		}
		
		System.out.print("찾을 정수 >> ");
		int k = sc.nextInt();
		
		int count = 0;
		for(int number : numbers) {
			if(number == k) {
				count++;
			}
		}
		System.out.println("\"" +k + "\"은 총 \"" + count + "\"개 있습니다.");
	
		// 강사님
		/* ★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * 1. "입력 횟수 >> " 출력
		 * 2. 입력 횟수를 입력받는다. -> n <- 3
		 * 3. "n개의 정수 입력 >> " 출력
		 * 4. n개의 정수를 입력 받는다. (배열과 반복문) ar <- 1,2,1
		 * 5. "찾을 정수 >> " 출력
		 * 6. 찾을 정수 k를 입력 받는다. k <- 1
		 * 7. 배열에 들어있는 값과 k를 비교하고 같은 수를 count 한다.  -> 반복문
		 */ 
		
//		 int n = 0, k = 0;
//		
//		 System.out.print("입력 횟수 >> ");
//		 n = sc.nextInt();
//		 System.out.println(n + "개의 정수 입력 >> ");
//		 
//		 int[] ar = new int[n];
//		 for(int i = 0; i < ar.length; i++) {
//			 ar[i] = sc.nextInt();
//		 }
//		 
//		 System.out.println("찾을 정수 >> ");
//		 k = sc.nextInt();
//		 int count = 0;
//		 
//		 for(int i = 0; i < ar.length; i++) {
//			 if(k == ar[i]) {
//				 count++;
//			 }
//		 }
//		 System.out.println(k + " 은 총 " + count + "개 있습니다!!");
		 
	}
}
