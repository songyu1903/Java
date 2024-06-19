package c_stream;

import java.util.List;


class MyClass{
	
	int data;
	public MyClass() {
		
	}
	
	public MyClass(int data) {
		this.data = data;
	}
	
	public String testMethod(String str) {
		return str + "입니다.";
	
	}
}

public class Ex06 {
	public static void main(String[] args) {
//		메서드 참조
//		람다식이 하나의 메서드를 호출하는 경우에만 사용 가능하다
//		불필요한 매개변수를 제거하고 사용할 수 있으며, 람다식의 가독성을 높인다.
		
//		★중요★
//		static 메서드 참조 -> 클래스명::메서드명
//		인스턴스 메서드 참조 -> 참조변수::메서드명
		
		
		List<String> list = List.of("1", "2", "3", "4");
		
		// list 안에 있는 문자열 "1","2" ... 을 str에 반환후 +9 를하면 문자열 + 정수 -> 19, 29, 39, 49
		list.stream().map(str -> str + 9).forEach(str -> System.out.println(str));
		System.out.println("==");
		list.stream()
//			.map(str -> Integer.parseInt(str)) // Interger.parseInt 로 인해 문자열인 list들이 int형으로 바뀐다
			.map(Integer::parseInt) // 정적 메서드 참조
			.map(str -> str + 9)
			.forEach(str -> System.out.println(str));
		
		System.out.println("==");
		
		MyClass mc = new MyClass();
		
		List<String> list3 = List.of("사과","바나나", "배");
		list3.stream()
//			.map(f -> mc.testMethod(f))
			.map(mc::testMethod) // 인스턴스 메서드 참조
			.forEach(str -> System.out.println(str));
		
		System.out.println("==");
		
		List<String> list2 = List.of("a", "bb", "ccc");
		list2.stream()
//			.map(str -> str.length())
			.map(String::length) // 특정 타입의 인스턴스 메서드 참조
			.forEach(leng -> System.out.println(leng));
		
		System.out.println("==");
		
		List<Integer> list4 = List.of(1,2,3,4,5);
		list4.stream()
			.mapToInt(i -> i)
//			.mapToObj(i -> new MyClass(i))
			.mapToObj(MyClass::new) // 생성자 참조
			.forEach(obj -> System.out.println(obj));
		
		list4.stream()
//			.forEach(i -> System.out.println(i));
			.forEach(System.out::println); // 출력 메서드 참조
		
		
		
		
		
		
		
	}
}