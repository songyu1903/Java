package a_exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			System.out.println("1");
			System.out.println("2");
			sc.next();
			System.out.println("3");
			System.out.println("4");
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("sc가 Null이다!!!");
			sc = new Scanner(System.in);
			sc.next();
		}finally {
			System.out.println("finally 코드!!!");
		}

		
		System.out.println("실행 시키고 싶은 명령어!!");
		
	}
	
}
