package a_exception;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			Integer.parseInt("안녕");
			System.out.println(10/0);
			sc.next();
		} catch (NullPointerException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
		} catch(ArithmeticException e) {
			System.out.println("예외 발생!!");
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
		} catch(Exception e) {
//			우리가 try 에서 어떤 오류가 발생할지 전부 에상하기는 힘들다.
//			예상치 못한 오류가 발생할 수 있다.
//			예상치 못한 오류를 잡기위해 Exception 타입의 참조변수를 사용한다
//			모든 예외의 조상은 Exception 클래스이다.
//			즉, 어떤 예외가 발생하더라도 Exception 타입의 참조변수에 저장가능하다.(업캐스팅)
			e.printStackTrace();
			System.out.println("예상치 못한 예외!!");
		}
		System.out.println("실행 시키고 싶은 명령어");
		
	}
}
