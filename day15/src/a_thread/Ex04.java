package a_thread;

class Test implements Runnable{ // 
	private int number;
	
	// 기본생성자
	public Test() {
		this.number = 100; // number 를 100으로 초기화
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			sub(10);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public  void sub(int number) {
		String name = Thread.currentThread().getName();
		
		synchronized (this) {
			this.number -= number;			
		}
		
		System.out.println("이름: " + name);
		System.out.println("현재 number : " + this.number);
		System.out.println("========================");
	}
	
//	public synchronized void sub(int number) {
//		String name = Thread.currentThread().getName();
//		this.number -= number;
//		System.out.println("이름: " + name);
//		System.out.println("현재 number : " + this.number);
//		System.out.println("========================");
//	}
}

public class Ex04 {
	public static void main(String[] args) {
		Test test = new Test();
		
		Thread t1 = new Thread(test, " 쓰레드-1");
		Thread t2 = new Thread(test, " 쓰레드-2");
		
		t1.start();
		t2.start();
	}
}
