package d_output;

public class Ex02 {

	public static void main(String[] args) {
//		System.out.printf("안녕하세요 ");
//		System.out.printf("반가워요~ 0ㅅ0");
		
//		형식 지정자(서식 문자)
//		- 출력 형식을 지정한다.
//		- %로 시작하면 printf() 에서 사용한다.
//		- 반드시 따옴표 안에서 작성한다.
//		- ',' 뒤에 나오는 값이 형식 지정자 위치로 들어가게 된다.
		
		int age = 10;
//		%d : 10진수 정수
		System.out.printf("제 나이는 %d살 입니다.\n", age);

//		%f : 실수
		double weight = 48.8;
		System.out.printf("제 몸무게는 %.1fkg 입니다.\n", weight);
		
//		%c : 문자
		System.out.printf("나의 학점은 %c 입니다.\n", 'A');
		
//		%s : 문자열
		System.out.printf("나의 이름은 %s 입니다.\n", "김송호");
		
//		서식문자의 옵션
//		%[- or 0][n][.m]서식문자
//		- 왼쪽 정렬
//		0 빈 공간을 0으로 채움
//		n  자릿수
//		.m  소숫점 아래 자리수 설정
		
		System.out.printf("%10d\n", 20);
		System.out.printf("%.3f\n", 123.321);
		
		
	}

}
