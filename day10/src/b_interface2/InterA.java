package b_interface2;

public interface InterA {
	/*public*/default void method1() {
		System.out.println("default 메서드!");
	}
	
	public static void method2() {
		System.out.println("static 메서드!");
	}
	
	private void method3() {
		System.out.println("private 메서드!");
	}

	public static void main(String[] args) {

	}
}
