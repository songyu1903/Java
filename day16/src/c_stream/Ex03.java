package c_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * Stream의 메서드는 중간 연산과 최종 연산으로 나뉜다. forEach()는 최종 연산 메서드이다. 다양한 중간연산 메서드를 알아보자.
		 */

//		map() : 요소를 받아 연산한다.
		IntStream.rangeClosed(0, 5)
			.map(i -> i + 10) // 중간 연산
			.forEach(i -> System.out.println(i));

//		sorted() : 정렬한다.
		int[] ar = { 6, 2, 4, 9, 3, 7 };
		Arrays.stream(ar)
			.sorted() // 2, 3, 4, 6, 7, 9 순서대로 정렬된다
			.forEach(i -> System.out.println(i));
		
		System.out.println("=====");

		
//		boxed() 메소드는 IntStream 같이 원시 타입에 대한 스트림 지원을 클래스 타입(예: IntStream -> Stream<Integer>)으로 전환해준다.
//		전용으로 실행 가능한 (예를 들어 int 자체로는 Collection에 못 담기 때문에 Integer 클래스로 변환하여 List<Integer> 로 담기 위해) 
//		기능을 수행하기 위해 존재한다.
		
//		boxed() : 박싱
//		sorted(Collections.reverseOrder()) : 역정렬, 단 일반자료형 요소는 박싱이 필요.
		Arrays.stream(ar)
			.boxed() // 박싱 
			.sorted(Collections.reverseOrder())
			.forEach(i -> System.out.println(i));
		
		System.out.println("=====");
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		
//		distinct() : 중복 하는 값을 제거해 준다.
		list.stream()
			.distinct() 
			.forEach(i -> System.out.println(i));
		System.out.println("=====");

//		mapToInt() : 언박싱을 해준다. (결과가 Int로 반환됨)
//		mapToDouble() : 언박싱을 해준다. (결과가 Double로 반환됨)
		list.stream().mapToInt(i -> i + 10).forEach(i -> System.out.println(i));
	
		
		System.out.println("=====");
		
//		filter() : 요소를 조건에 맞게 걸러낸다.
//		짝수
		list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
		
		System.out.println("=====");

		list.stream()
			.map(i -> i + 10)
			.map(i -> i * 2)
			.filter(i -> i % 2 == 0)
			.distinct() // 중복제거
			.forEach(i -> System.out.println(i)); // forEach 는 void 반환이기때문에 최종연산으로 사용한다.
		
	}
}





















