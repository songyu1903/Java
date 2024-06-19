package b_date;

public class MySingleton {
	int number;
	private static MySingleton instance;
	
	private MySingleton() {
		
	}
//	static(참조 주소) 은 하나밖에 없는 공간 -> 변하지 않는 주소
	public static MySingleton getInstance() { // getInstance 메서드를 static으로 만듬
		if(instance == null) {
			instance = new MySingleton();
		}
		
		return instance;
	}
}
