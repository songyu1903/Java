package a_switch;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		String result = "";

		System.out.println("1부터 4까지의 정수 입력 >> ");
		input = sc.nextInt();

		switch (input) {
		case 1, 3: 
			result = "홀수";
			break;
		case 2, 4: 
			result = "짝수";
			break;		
		default:
			result = "잘못입력함";
			break;
		}
		System.out.println(result);
	}

}
