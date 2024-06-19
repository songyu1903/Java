package b_map;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WeatherApiTest {
	private String nx = "61";
	private String ny = "129";
	private String baseDate = "20240516";
	private String baseTime = "2300";
	private String dataType = "json";
	
	public void getWeatherData() throws Exception{
		String apiUrl = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst";
		String apiKey = "xJrBpHgAj1p3H%2BqYTP7UwQ8kRwsmWkcDQujwlgy6mgZfE57HRIik96zPbcRJ5%2BUfIthd0sOrtq2muEMfmEDc1g%3D%3D";
		
//		http 통신에 필요한 객체를 담을 변수
		URL url = null;
		HttpURLConnection conn = null;
		
//		http 통신 요청 후 데이터를 받기위한 변수
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		String temp = null, result = null;
		
		String reqURL = apiUrl +"?ServiceKey=" + apiKey
				+ "&nx=" + nx
				+ "&ny=" + ny
				+ "&base_date=" + baseDate
				+ "&base_time=" + baseTime
				+ "&dataType=" + dataType;
		
		url = new URL(reqURL);
		
		conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-Type", "application/json");
		
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() < 300) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		
		while ((temp = br.readLine()) != null) {
			sb.append(temp);
		}
		
		br.close();
		conn.disconnect();
		result = sb.toString();
		
//		System.out.println(result);
		
		JSONParser parser  = new JSONParser();
		JSONObject json = (JSONObject)parser.parse(result);
		System.out.println(json.get("response"));
	}
	
	public static void main(String[] args) {
		try {
			new WeatherApiTest().getWeatherData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}










