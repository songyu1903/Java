package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student("김송호", 4);
		Employee em = new Employee("장희재", 5);
		
		int choice = 0;
		
		System.out.println("""
				1. 김송호
				2. 장희재
				""");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("""
					1. 공부하기
					2. 밥먹기
					""");
			choice = sc.nextInt();
			if(choice == 1) {
				st.study();
			}else
				st.eat();
			break;
		case 2:
			System.out.println("""
					1. 일하기
					2. 밥먹기
					""");
			choice = sc.nextInt();
			if(choice == 1) {
				em.work();
			}else
				em.eat();
			
		}
	}
}
