package b_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 1~20까지의 난수를 만들어 ArrayList에 5개만 저장한다.
 * 1. 중복되는 수는 없도록 한다.
 * 2. 최종적으로 정렬한다.
 */
public class Task01 {
	public static void main(String[] args) {
		Random r =new Random();
//		r.nextInt(20); // 0~19
//		r.nextInt(20) + 1 // 1~20
		
		List<Integer> list = new ArrayList<>();
		
		while(list.size() < 5) {
			int tmp = r.nextInt(20) + 1;
			
			if(list.contains(tmp)) { continue; }
				
			list.add(tmp);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}










