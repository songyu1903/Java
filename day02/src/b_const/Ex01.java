package b_const;

public class Ex01 {

	public static void main(String[] args) {
		int num = 1;
		num = 30;
		
		System.out.println(num);
		
		// 상수 - final(const) -> 변하지 않는 값
		// 변수와 동일한 저장공간이다.
		// 변수와의 차이점은 한 번 저장한 값을 변경할 수 없다.
		
		final int NUM2 = 10;
//		num2 = 30; (x) 오류! 상수는 값을 변경할 수 없다.
		System.out.println(NUM2);

		// 상수와 변수를 이름만으로 구분하기 위해서 상수는 대문자와 언더바로 이름을 지어준다
		final int USER_AGE = 30;
		
//		리터럴(Literal)
//		값 그 자체를 의미한다.
//		값은 의미가 변하지 않는다.
	}

}
