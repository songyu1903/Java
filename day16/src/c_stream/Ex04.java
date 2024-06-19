package c_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
//		Stream의 최종 연산
		int[] ar = { 3, 5, 6, 1, 2 };

		List<Integer> list = new ArrayList<>();

		for (int data : ar) {
			list.add(data);
		}

//		forEach() : 반환이 void 인 최종 연산 메서드
		Arrays.stream(ar).forEach(i -> System.out.println(i));
		System.out.println("==");
		list.stream().forEach(i -> System.out.println(i));
		System.out.println("==");
		list.forEach(i -> System.out.println(i));

//		count() : 요소의 수를 세어준다.
		long cnt = list.stream().count(); // list에 5개의 수가 들어가있어서 5가 나온다
		System.out.println(cnt);

		System.out.println("==");

//		sum() : 요소의 합을 구해준다. (기본 타입 스트림만 가능하므로 Integer는 언박싱을 해야한다)
		int sum = list.stream().mapToInt(i -> i).sum();
		System.out.println(sum);

		System.out.println("=====================");

//		List.of() : 
//		List<Integer> list2 = List.of(ar);

//		collect(Collectors.toList()) : 최종 반환을 리스트로 해준다. 박싱을 항상 주의한다.
//		muttable(가변) 리스트를 반환하므로 값을 추가, 삭제, 수정 할 수 있다
		List<Integer> list2 = Arrays.stream(ar).boxed().collect(Collectors.toList());
		list2.add(200);
		System.out.println(list2);

//		toList() : 최종 반환을 Immuttable(불변) 리스트를 반환하므로 값을 추가, 삭제, 수정 할 수 없다.
		List<Integer> list3 = Arrays.stream(ar).boxed().toList();
		System.out.println(list3);
//		list3.add(100);

//		정방향 정렬
		Set<Integer> set = Arrays.stream(ar).boxed().collect(Collectors.toSet());
		System.out.println(set);

		Map<String, Integer> map = Arrays.stream(ar).boxed()
				.collect(Collectors.toMap(i -> i + "번째", i -> i * 10));
		
		System.out.println("=====================");
		System.out.println(map);

		
		System.out.println("=====================");
		Object[] myAr = list.stream().toArray();
		System.out.println(myAr);
		
		System.out.println("=====================");
		
//		toArray() : 최종 반환을 배열로 해준다. 언바싱을 항상 주의한다.
		int[] myAr2 = list.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(myAr2));
	}
}
