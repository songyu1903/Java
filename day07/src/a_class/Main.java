package a_class;

import java.util.Scanner;

class Tv{
	String color; // 색깔
	int price; // 가격
	boolean power; // 전원
	int ch;  // 채녈개수
	
	public Tv(String color, int price, boolean power, int ch) {
		this.color = color;
		this.price = price;
		this.power = power;
		this.ch = ch;
	}
	
	void PowerOnOf() {
		power = !power;
	}
	
	int chUp() {
		return ++ch; // 채널증가
	}
	int chDown() {
		return --ch;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tv tv = new Tv("Black", 10_100, false, 1);
		
		int choice = 0;
		// 반복문
		while(true) { 
			System.out.println("===================\n");
			System.out.print("""
					1. 전원
					2. 채널 올리기
					3. 채널 내리기
					입력 >>> """);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
//				if(tv.power) {
//					System.out.println("전원 끄기!");
//				}else {
//					System.out.println("전원 켜기!");
//				}
				System.out.println(tv.power ? "전원 끄기!" : "전원 켜기!");
				tv.PowerOnOf();
				break;
			case 2:
				if(tv.power) {
					System.out.println("채널: " + tv.chUp());					
				}
				break;
			case 3:
				if(tv.power && tv.ch > 1) {
					System.out.println("채널: " + tv.chDown());					
				}
				break;
			default:
				System.out.println("잘못 입력함!");
			}
		}
	}

}






















