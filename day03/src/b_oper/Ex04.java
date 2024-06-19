package b_oper;

public class Ex04 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 20;
		int num4 = num1 > num2 ? 1 : -1;

		System.out.println(true ? 10 : 100);
		System.out.println(false ? 10 : 100);
		int age = 20;
		System.out.println(age > 19 ? "성인" : "청소년");

		System.out.println("=======================================");
		System.out.println(num1 == num2 ? "같다" : "다르다");
		System.out.println(num2 == num3 ? "같다" : "다르다");
		System.out.println(num1 > num2 ? "크다" : "작다");

		System.out.println(num4);
		System.out.println("=======================================");

		System.out.println(num1 < num2 ? num1 : num2);
		System.out.println(num1 > num2 ? "num1이 크다" : num1 == num2 ? "같다" : "num2가 크다."); // 별로 안좋은 코드
		
		
	}
}
