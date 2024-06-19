package a_thread;

public class ClassB implements Runnable{ // 인터페이스 Runnable이 run()메서드를 가지고있다
	@Override
	public void run() { // 추상 메서드
		String name = Thread.currentThread().getName(); // 현재쓰레드의 이름을 가져온다
		
		for(int i=0; i<10; i++) {
			System.out.println(name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + "Thread 종료!!!");
	}
}
