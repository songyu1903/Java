package c_stream;

import java.util.stream.IntStream;

public class Ex02 {
	public static void main(String[] args) {
		IntStream is = IntStream.range(0, 5);
		
//		스트림이 가진 요소가 넘어오는 방식 : 각각의 요소를 하나씩 매개변수 i로 넘겨준다.
		is.forEach(i -> System.out.println(i)); 
		
//		스트림은 1회성이기 때문에 재사용이 불가능하다.
//		스트림은 변수에 저장하였어도 재사용이 불가능하다.
//		is.forEach(i -> System.out.println(i));
		
//		그러므로 스트림을 변수에 담을 필요가 없다.
		IntStream.rangeClosed(0, 5).forEach(i -> System.out.println(i));
		
		
	
	}
}
