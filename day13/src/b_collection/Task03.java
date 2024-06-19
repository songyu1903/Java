package b_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		List<Integer> list = makeList();
		Scanner sc = new Scanner(System.in);
		String msg = "정수를 입력하세요(1~20) >> ";
		String resultMsg = null;
		int tmp = 0, flag = 0, count = 0;
		
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
	
	public static List<Integer> makeList() {
		Random r =new Random();
		List<Integer> list = new ArrayList<>();
		
		while(list.size() < 5) {
			int tmp = r.nextInt(20) + 1;
			if(list.contains(tmp)) { continue; }
			list.add(tmp);
		}
		
		Collections.sort(list);
		return list;
	}
	
	
}












