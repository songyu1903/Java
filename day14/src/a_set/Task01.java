package a_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Task01 {
	public static void main(String[] args) {
		printLottoNum(5);
	}
	
	public static void printLottoNum(int line) {
		Random r = new Random();
		Set<Integer> lottoNum = new HashSet<Integer>();
		
		for (int i = 0; i < line; i++) {
			lottoNum.clear();
			while (lottoNum.size() < 6) {
				lottoNum.add(r.nextInt(45) + 1);
			}
			List<Integer> result = new ArrayList<Integer>(lottoNum);
			Collections.sort(result);
			System.out.println(result);
			
		}
		
	}
}












