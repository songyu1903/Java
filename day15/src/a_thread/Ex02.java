package a_thread;

public class Ex02 {
	public static void main(String[] args) {
		ClassB b1 = new ClassB();
		ClassB b2 = new ClassB();

//		Runnable 인터페이스를 구현하면 start()는 없다
//		start()는 Thread에 있다.
		Thread t1 = new Thread(b1, "A");
		Thread t2 = new Thread(b2, "B");
		
//		t1.start();
//		t2.start();
		
		
//		Runnable 인터페이스는 함수형인터페이스이다.
//		람다식을 활용할 수 있다
		Runnable r1 = () -> {
			String name = Thread.currentThread().getName();
			
			for(int i=0; i<10; i++) {
				System.out.println(name);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(name + "\nThread 종료!!");
		};
		Thread test = new Thread(r1, "C");
		test.start();
				
	}
}
