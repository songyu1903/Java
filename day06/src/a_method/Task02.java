package a_method;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		System.out.println(changeSign(10));
		printName("김철수", 10);
		
		System.out.println(changeNumber(15));
		
		System.out.println( getAvg( new int[] {1,2,3,4,5,6} ) );
		
		System.out.println( getAvg2( new int[] {1,2,3,4,5,6} ) );
		System.out.println( getAvg2(1,2,3,4,5,6) );
		
		System.out.println(changeCase("bAnANa"));
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(login("admin", 1234));
	}
	
//	1. 정수를 넘겨받아 음수면 양수로 양수면 음수로 반환하는 메소드
//	 10 -> -10, -1 -> 1
	static int changeSign(int num) {
		return -num;
	}
	
//	2. 이름과 정수를 넘겨받아 정수 만큼 이름을 출력하는 메서드
//	"홍길동", 8 -> "홍길동" 8번 출력하기
	static void printName(String name, int n) {
		for(int i=0; i<n; i++) {
			System.out.println(name);
		}
	}
	
//	3. 정수를 넘겨받아 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 바꿔서 반환하는 메서드
	static int changeNumber(int num) {
		return num <= 10 ? 1 : 100;
	}
	
//	4. 여러 정수를 넘겨받아 평균 값을 반환하는 메서드
	static double getAvg(int[] ar) {
		int total = 0;
		
		for(int i=0; i<ar.length; i++) {
			total += ar[i];
		}
		
		return total / (double)ar.length;
	}
	
	static double getAvg2(int... num) {
		int total = 0;
		
		for(int i=0; i<num.length; i++) {
			total += num[i];
		}
		
		return total / (double)num.length;
	}
	
//	5. 소문자를 대문자로, 대문자를 소문자로 바꿔주는 메서드
//	BaNanA -> bAnANa
	static String changeCase(String str) {
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			char alpha = str.charAt(i);
			
			if(alpha >= 'a' && alpha <= 'z') {
				result += (char)(alpha - 32);
			}else if( alpha >= 'A' && alpha <= 'Z' ) {
				result += (char)(alpha + 32);
			}
		}
		
		return result;
	}
	
	
//	6. 아이디 비밀번호를 넘겨받아 일치하는지 확인하기
//	id : admin, password : 1234
	static boolean login(String id, int pw) {
		return id.equals("admin") && pw == 1234;
	}
	
}










