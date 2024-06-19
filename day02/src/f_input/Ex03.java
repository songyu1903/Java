package f_input;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 >> ");
		String input = scan.next();
		scan.nextLine();
		String input2 = scan.nextLine();
		
		System.out.println(input);
		System.out.println(input2);
		
	}

}
