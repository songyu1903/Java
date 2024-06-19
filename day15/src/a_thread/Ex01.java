package a_thread;

public class Ex01 {
	public static void main(String[] args) {
		ClassA a1 = new ClassA("#");
		ClassA a2 = new ClassA("★");
		
//		run()은 다른 쓰레드가 실행시킬 코드를 정의한 메서드이다.
//		run()을 실행시키는 것은 단순히 싱글 쓰레드로 메서드를 실행시키는것 이다;
//		a1.run();
//		a2.run();
		
//		start()를 사용해야 새로운 쓰레드를 이용하여 run()에 재정의한 코드를 실행시킨다
		a1.start();
		a2.start();
		
		
		
		for(int i = 0; i<10; i++) {
			System.out.println("main!!!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 0.5초 멈춤
		}
		System.out.println("main 종료!!!");
	}
}
