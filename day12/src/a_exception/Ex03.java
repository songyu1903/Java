package a_exception;

public class Ex03 {
	public static void main(String[] args) {
		method(null);

		method2(null);
		
		try {
			method2(null);
		} catch (Exception e) {
			method2("hi");
		}
	}
	
	static void method2(String str) {
		System.out.println(str.equals("hi"));

	}
	
	static void method(String str) {
		if(str == null) {
			System.out.println("str이 null이야!!");
			return;
		}
		System.out.println(str.equals("hi"));
	}
}
