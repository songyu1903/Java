package b_collection;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(1);
//		list.add(3.14);
//		list.add(true);
//		list.add("string");
//		
//		for(int i=0; i < list.size(); i++	) {
//			System.out.println(list.get(i));
//		}
		
//		<Integer> : 제네릭
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		
//		빠른 for문
//		index 번호가 필요없다.
		for( Integer data  : list  ) {
			System.out.println(data);
		}
		
		int[] ar = {1,2,3,4,5};
		for(int num : ar) {
			System.out.println(num);
		}
		
//		ArrayList는 toString()이 재정의 되어있다.
		System.out.println(list);
		
		
	}
}













