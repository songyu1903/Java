package a_static;

import java.util.Random;
import java.util.Scanner;

// 무기 강화 예제
class Enhance{
	// final 키워드로 상수로 만들어버림
	static final boolean[] AR_CHANCE = {true, true, true, true, true, true, true, false, false, false}; // 명시적 초기화
	String weponeName;
	int cnt; // 강화 성공 카운트

	public Enhance(String weponeName) {
		this.weponeName = weponeName;
	}
//	기능
	void start() {
		Random r = new Random();
		int index = r.nextInt(10); // 0 ~ 9까지의 랜덤 숫자 반환
		
		if(AR_CHANCE[index]) {
			cnt++;
			System.out.println("강화 성공!!");
		}else {
			cnt = 0;
			System.out.println("강화 실패...");
		}
	}
	void printInfo() {
		System.out.println("+============+");
		System.out.println("| "+weponeName + " +" + cnt + " |");
		System.out.println("+============+");
	}
}

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		boolean flag = true;
		String input = "";
		Enhance enhance = new Enhance("천하제일검");
		
		while(flag) {
			System.out.print("1. 강화시작\n2.종료\n입력 >> ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				enhance.start();
				enhance.printInfo();
				break;
			case 2:
				System.err.println("종료 하시려면\"종료\"라고 입력하세요 >> ");
				input = sc.next();
				if(input.equals("종료")) { flag = false; }
				break;
			default:
				System.out.println("※잘못 입력함※");
				
			}
		}
		
	}

}
