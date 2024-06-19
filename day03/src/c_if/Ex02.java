package c_if;

public class Ex02 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		
		System.out.println("1번");
		if(num1 == 10 && num2 < 30) {
			System.out.println("2번");
		}
		
		if(true || num1*20 % 30 > 10) {
			System.out.println("3번");
		}
		
		System.out.println("4번");
	}

}







