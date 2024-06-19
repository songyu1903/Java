package b_interface;

public class Ex02{
	public static void main(String[] args) {
		method(new BasicFan());
		System.out.println("=================");
		method(new SmartFan());
	}
	
	// 인터페이스도 타입으로 사용 가능
	static void method(Fan fan) {
		fan.on();
		fan.off();
		fan.turbo();
	}
}
