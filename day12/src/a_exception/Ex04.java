package a_exception;

public class Ex04 {
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {

		}
	}
	
	static void method() throws InterruptedException{
		for(int i=0; i<10; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}
