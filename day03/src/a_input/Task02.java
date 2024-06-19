package a_input;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * 입력)
		 * 		좋아하는 숫자 >> 3	< int
		 * 		좋아하는 동물 >> 강아지  < String
		 * 		
		 * 출력)
		 * 		내가 좋아하는 숫자는 3이고 좋아하는 동물은 강아지이다.
		 * 		
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("좋아하는 숫자 >> ");
		int num1 = scan.nextInt();
		System.out.print("좋아하는 동물 >> ");
		String animal = scan.next();
		
		System.out.println("내가 좋아하는 숫자는 " + num1 + " 이고" + " 좋아하는 동물은 " + animal + "이다");
		
		// 강사님 코드
		Scanner sc = new Scanner(System.in);
		String msg1 = "좋아하는 숫자 >> ", msg2 = "좋아하는 동물 >>";
		int num = 0; // int num을 0으로 초기화
		String animal2 = "";
		/*
		 * defalut(기본값) -> 값을 넣기 애매할때 기본 설정하는 값)
		 * int = 0
		 * double = 0.0
		 * char = ''
		 * boolean = false
		 * String = "", null
		 */
		
		System.out.print(msg1);
		num = sc.nextInt();
		
		System.out.print(msg2);
		
		animal = sc.next();
		System.out.println("내가 좋아하는 숫자는 " + num + " 이고, 좋아하는 동물은" + animal + "이다.");
		
	}

}
