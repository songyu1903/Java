package b_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
	public static void main(String[] args) {
		Map<String, Integer> map  = new HashMap<>();
		
		map.put("Apple", 20);
		map.put("Pear", 10);
		map.put("Grape", 40);
		map.put("Banana", 70);
		
		System.out.println(map);
		
		System.out.println(map.get("Pear"));
		
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
}












