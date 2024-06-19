package b_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task02 {
	/*
	 * list에 값을 5개 저장하고 정렬한다. (1~20까지의 정수만 사용)
	 * 사용자가 list에 저장된 값을 맞추는 프로그램을 만든다.
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		String msg = "정수를 입력하세요(1~20) >> ";
		String resultMsg = null;
		int tmp = 0, flag = 0, count = 0;
		
		list.add(11);
		list.add(7);
		list.add(3);
		list.add(17);
		list.add(10);
		
		Collections.sort(list);
		
		List<String> viewList = new ArrayList<String>();
		
		for(int i=0; i<list.size(); i++) {
			viewList.add("?");
		}
		
		
		
		while(true) {
			System.out.println(viewList);
			System.out.print(msg);
			tmp = sc.nextInt();
			count++;
			
			if(list.contains(tmp)) {
				resultMsg = "맞췄습니다!";
				
				int idx = list.indexOf(tmp);
				viewList.set(idx, tmp + "");
				list.set(idx, Integer.MIN_VALUE);
				
				flag++;
			}else {
				resultMsg = "틀렸습니다.";
			}
			
			System.out.println(resultMsg);
			
			if(flag == 5) { break; }
		}
		
		System.out.println("===================");
		System.out.println("축하합니다!");
		System.out.println(count + "번 시도하였습니다!");
		
	}
}












