package b_object;

public class Ex03 {
	public static void main(String[] args) {
		String str1 = "철수";
		String str2 = "철수"; // 리터럴을 이용한 문자열 객체 생성
		String str3 = new String("철수"); // new 연산자를 이용한 문자열 객체 생성
		
		System.out.println( str1 == str2); // 참조값(주소값 100번지)이 같다
		System.out.println( str1 == str3); // 참조값(주소값 100번지와 200번지)이 다르다
		System.out.println(str1.equals(str2)); // 값이 같다
		System.out.println(str1.equals(str3)); // 값이 같다
		
		
	}
}





