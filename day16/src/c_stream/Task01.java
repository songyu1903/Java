package c_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
	public static void main(String[] args) {
		int[] ar = { 2, 2, 7, 7, 5, 5, 1, 1, 6, 6 };

//		ar 배열을 List<Integer>로 변환해서, list 변수에 저장하기
		List<Integer> list = Arrays.stream(ar)
								.boxed()
								.collect(Collectors.toList());
//								System.out.println(list);
		
//		위에서 만든 list의 중복값을 없애고, int[]로 변환해서 ar2변수에 저장하기
		int[] ar2 = list.stream()
					.mapToInt(i -> i)
					.toArray();

//		ar배열의 중복값을 처리하고, 각요소에 10을 더하고, 정렬하여 출력하기
		Arrays.stream(ar)
			.distinct()
			.map(i -> i + 10)
			.sorted()
			.forEach(i -> System.out.println(i));
		
//		ar배열의 요소 중 홀수만 골라서, 3을 더하고, 역정렬하고, 아무 문자열과 연결해서 출력하기
		Arrays.stream(ar)
			.filter(i -> i % 2 != 0)
			.map(i -> i + 3)
			.boxed()
			.sorted(Collections.reverseOrder())
			.map(i -> i + "★★")
			.forEach(str -> System.out.println(str));
		
	}
	
}
