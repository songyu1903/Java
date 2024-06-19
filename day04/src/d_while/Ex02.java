package d_while;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String msg = """
				메뉴를 선택해 주세요.
				1. 주문하기
				2. 종료하기
				입력 >>
				""";
		while (true) {
			System.out.print(msg);
			choice = sc.nextInt();
			
			
			if (choice == 2) { break; }
			
		}
	}

}
