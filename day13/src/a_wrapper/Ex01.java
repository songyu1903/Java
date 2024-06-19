package a_wrapper;

public class Ex01 {
	public static void main(String[] args) {
//		Wrapper Class
//		기본 자료형들의 클래스 타입
		
//		boxing : 기본값 -> wrapper 타입
		Integer numInt = new Integer(3);
		Integer numInt2 = Integer.valueOf(3);
		Double numDouble = new Double(3.14);
		Double numDouble2 = Double.valueOf(3.14);
		Boolean bool = Boolean.valueOf(true);
		Long numLong = Long.valueOf(3L);
		
//		unboxing
		int num = numInt.intValue();
		boolean isTrue = bool.booleanValue();
		
//		JDK4 버전 이상부터는 오토 박싱, 오토 언박싱을 지원한다.
		
//		auto boxing
		Integer numInt3 = 3;
//		auto unBoxing
		int num2 = numInt3;

//		Wrapper Class를 사용하는 이유
//		- 클래스타입은 다양한 메소드를 제공한다.
//		- 자바에서는 클래스타입이 갖는 이점이 많다.
//		  예를 들어 api에서 제공하는 메소드는 매개변수로 클래스타입(Object)을 받는 경우가 많다.
//		  이런 경우 기본 자료형을 넘겨줄 수 없으므로 박싱을 해줘야한다.
	}
}











