package b_lambda2_task;
/*
 * 두 문자열을 넘겨 받아 첫 번째 문자열을 두 번째 문자열의 길이만큼 잘라내는 프로그램
 * 
 * ex)
 * 첫 번쨰: abcde
 * 두 번쨰: 가나다
 * 
 * 결과)
 * de
 * 
 * 다음과 같은 메서드를 만든다.
 * -매개변수로 문자열을 전달 받는다.
 * -전달받은 문자열이 "F"면 앞에서 자르고 "B"면 뒤에서 자르는 람다식을 만든다
 */
@ FunctionalInterface
interface SubInter{
	String mySunString(String str1, String str2);
}

public class Task02 {
	public static void main(String[] args) {
		// substring -> 문자열을 잘라주는 명령어
//		SubInter s1 = (str1, str2) -> str1.substring(str2.length());
//		"abcde".substring("가나다".length());
//		
//		String result = s1.mySunString("abcde", "가나다");
//		System.out.println(result);
		
		String result = checkString("B").mySunString("abcde", "가나다");
		System.out.println(result);
		
	}
	static SubInter checkString(String str) {
		SubInter sub = null;
		
		switch(str) {
		case "F":
			sub = (s1, s2) -> s1.substring(s2.length());
			break;
		case "B":
			sub = (s1, s2) -> s1.substring(0, s1.length() - s2.length());
			break;
		}
		
		return sub;
		
	}
}
