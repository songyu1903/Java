package b_lambda2_task;
/*
 * 
 * 
 */

@FunctionalInterface
interface MultipleInter {
	int multiplyNumber(int num1, int num2); // int 매개변수를 2개받는 추상 메서드
}

public class Task01 {
	public static void main(String[] args) {
		MultipleInter multi = (a, b) -> a * b;
		System.out.println(multi.multiplyNumber(2, 4));

		MultipleInter m = calculator(true);
		int num = m.multiplyNumber(10, 20);
		System.out.println(num);
		
	}
	
	static MultipleInter calculator(boolean isTrue) {
		MultipleInter mi = null;
		
		if(isTrue) {
			mi = (num1, num2) -> num1 * num2; 
		}else {
			mi = (num1, num2) -> 0;
		}
		
		return mi;
	}
}
