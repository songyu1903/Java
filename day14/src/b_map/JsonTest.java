package b_map;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
//		String str = "{\"name\":\"홍길동\", \"age\":22}";
		Map<String, String> user = new HashMap<String, String>();
		
		user.put("id", "aaa");
		user.put("pw", "1234");
		user.put("name", "홍길동");
		
		System.out.println(user);
		
		JSONObject json = new JSONObject(user);
		System.out.println(json);
		System.out.println(json.get("name"));
		
		JSONArray jsonAr = new JSONArray();
		jsonAr.add(json);
		
		
		JSONObject json2 = new JSONObject(user);
		jsonAr.add(json2);
		
		
		System.out.println(jsonAr);
		System.out.println(jsonAr.get(1));
	}
}













