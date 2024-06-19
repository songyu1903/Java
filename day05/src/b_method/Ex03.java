package b_method;

public class Ex03 {

	public static void main(String[] args) {
		printName("김철수");
//		printName2();
		printAgeAndName(26, "김송호");
	}

	static void printName(String name) {
		System.out.println(name);
	}
//	static void printName2() {
//		System.out.println("김철수");
//	}
	static void printAgeAndName(int age, String name) {
		System.out.println(age);
		System.out.println(name);
	}
}
