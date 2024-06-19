package a_method;

public class Task01 {
//	이름을 넘겨받아 1.OOO님 안녕하세요, 2.OOO님 안녕하세요.... 5번 출력하는 메서드
	static void printName(String name) {
		for(int i=0; i<5; i++) {
			System.out.println(i+1 + ". " + name + "님 안녕하세요");
		}
	}
	
//	1~100까지의 합을 반환하는 메서드
	static int getTotal() {
		int total = 0;
		
		for(int i=1; i<=100; i++) {
			total += i;
		}
		
		return total;
	}
	
//	5개의 정수를 넘겨받아 합을 반환하는 메서드
	static int getTotalOfArray(int[] arNumber) {
		int total = 0;
		
		for(int i=0; i<arNumber.length; i++) {
			total += arNumber[i];
		}
		
		return total;
	}
	
//	정수 num을 넘겨받아 1~num 까지의 합을 출력하는 메서드
	static void printTotal(int num) {
		int total = 0;
		
		for(int i=1; i<=num; i++) {
			total += i;
		}
		
		System.out.println("1부터 " + num + "까지의 합 >> " + total);
	}
	
	
	public static void main(String[] args) {
		printTotal(1000);
		
//		int[] ar = {10,20,30,4,5};
		
//		int num = getTotalOfArray(new int[]{10,20,30,4,5});
//		
//		System.out.println(num);
		
		
//		 printName("홍길동");
		  
//		  int num = getTotal(); System.out.println(num);
		 
	}
	
}








