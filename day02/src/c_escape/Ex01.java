package c_escape;

public class Ex01 {

	public static void main(String[] args) {
//		제어문자(Escape Character)
//		- 따옴표 안에서 사용되며, 미리 예약된 특수 기능을 하는 문자
//		- \(백슬래시 또는 역슬래시) 를 사용한다.
//			\n : 줄 바꿈(Enter)
//			\t : 일정 간격을 띄어준다. 탭(Tab) 
//			\" : 문자열 안에 큰 따옴표를 표현
//			\' : 문자열 안에 작은 따옴표를 표현
//			\\ : 문자열 안에 역슬래시를 표현
		System.out.println("안녕\n하세요.");
		System.out.println("반갑\t습니다.");
		System.out.println("나는\"인사를\"했다");
		System.out.println("\"어서오세요\".");
		System.out.println("\'나랑 놀자!!\'");
		System.out.println("제어문자는 \\로 시작한다.");
		
	}

}
