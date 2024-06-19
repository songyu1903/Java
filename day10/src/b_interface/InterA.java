package b_interface;

public interface InterA{
	// 필드는 public static final 이 자동으로 붙는다
	int VAR1 = 10;
	public static final int VAR2 = 20; // 정적 상수(움직이지 않고 변하지않는 값)

	// 인터페이스는 객체화 불가
	
	// 메서드는 public abstract 가 자동으로 붙는다
	void method1();
	public abstract void method2(); // 추상 메서드
	
}
