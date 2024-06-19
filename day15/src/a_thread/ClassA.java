package a_thread;

public class ClassA extends Thread{ // Thread클래스 상속
	private String str;

	public ClassA(String str) {
//		super();
		this.str = str;
	}
	
	@Override
	public void run() {
//		새로운 쓰레드가 작업할 내용을 정의하는 메서드
		for(int i = 0; i<10; i++) {
			System.out.println(this.str);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 0.5초 멈춤
		}
		System.out.println(this.str + "종료!!!");
	}
}











