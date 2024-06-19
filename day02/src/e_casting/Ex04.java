package e_casting;

public class Ex04 {

	public static void main(String[] args) {
//		int,long,double,char,boolean -> 기본 자료형, 원시 자료형(primitive type)
//		String, 클래스, 배열 -> 참조 자료형(reference type)
		
//		기본 자료형 -> String(참조 자료형)
//		문자열과 다른 자료형을 연결하면 결과는 항상 문자열이 된다.
		String str1 = 3 + "";
		String str2 = 3.0 + "";
		String str3 = 'a' + "";
		String str4 = true + "";
		
//		String(참조 자료형) -> 기본 자료형
//		기본 자료형은 기본 자료형끼리 형변환이 가능하다.
//		참조 자료형(클래스)은 기본 자료형으로 형변환이 불가능하다
//		그러나 String 타입은 Integer, Double, Boolean 클래스들의 도움을 받아서 형변환이 가능하다.
		int num1 = Integer.parseInt("3");
		int num2 = Integer.parseInt(str1);
		double num3 = Double.parseDouble("3.14");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);		
	}
}

	