package a_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Set<String> animalSet = new HashSet<>();
		animalSet.add("원숭이");
		animalSet.add("양");
		animalSet.add("쥐");
		animalSet.add("기린");
		animalSet.add("하마");
		animalSet.add("하마");
		animalSet.add("하마");
		animalSet.add("토끼");
		
		System.out.println(animalSet);
		
		Iterator<String> iter = animalSet.iterator();
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());

		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println(   animalSet.contains("하마")   );
	}
}












