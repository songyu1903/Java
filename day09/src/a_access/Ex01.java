package a_access;

public class Ex01 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		
		a.var1 = 1;
		a.var2 = 2;
		a.var3 = 3;
		
		System.out.println(a.var3);
//		a.method1(); // private 여서 접근 불가
	}
	
}
