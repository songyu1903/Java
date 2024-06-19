package a_static;

import java.util.*;

public class RandomTest {
	public static void main(String[] args) {
//		Random 클래스
//		- 랜덤과 관련된 기능을 제공하는 클래스
//		- nextInt(int bound)
//		매개변수로 정수 값을 넘겨주면 0부터 bound-1 만큼의 범위를 갖는 난수를 반환한다.
		
		Random r = new Random();
		
		System.out.println(r.nextInt(11));  // 매개변수로 범위를 정해줌 0 ~ 10 까지 나온다
	}
}
