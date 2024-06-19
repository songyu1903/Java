package f_input;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 이름을 입력하세요 >> OOO
		// OOO님 안녕하세요
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 >> ");
//		String name = scan.next(); // next() -> 띄어쓰기 불가
		String name = scan.nextLine(); // nextLine() -> 한 줄을 통째로 입력받음 띄어쓰기 가능
		System.out.println(name + " 님 안녕하세요!");
		
		
	}

}
