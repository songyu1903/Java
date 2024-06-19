package b_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
//		추가
		list.add(10);
		list.add(30);
		list.add(80);
		list.add(20);
		list.add(90);
		list.add(40);
		list.add(70);
		
		System.out.println(list);
		
//		값 가져오기 : index번호로 특정 값 가져오기
		System.out.println(list.get(1));
		
//		삭제 : index번호로 삭제 (int 타입으로 넘겨줘야함)
		list.remove(1);
		System.out.println(list);
		
//		삭제 : 값으로 검색하여 삭제(Object 타입으로 넘겨줘야함)
		list.remove(Integer.valueOf(80));
		System.out.println(list);
		
//		전체 삭제
//		list.clear();
//		System.out.println(list);
		
//		포함 여부 검사  : 리스트에 존재하면 true, 없으면 false
		System.out.println(list.contains(700));
		
//		값으로 인덱스 가져오기 : 해당 값의 인덱스 번호를 반환
		System.out.println(     list.indexOf(90)     );
		
//		수정 : 수정할 인덱스와 값을 넘겨주어 수정한다.
		list.set(2, 1000);
		System.out.println(list);
		
	}

}













