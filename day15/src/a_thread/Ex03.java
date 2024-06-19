package a_thread;

public class Ex03 {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			String name = Thread.currentThread().getName();

			for (int i = 0; i < 10; i++) {
				System.out.println(name);

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println(name + " Thread 종료!!");
		};
		
		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r1, "t2");
		t1.start();
		
		try {
			t1.join(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
		r1.run();
	}
}
