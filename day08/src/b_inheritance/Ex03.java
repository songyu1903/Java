package b_inheritance;

class ClassA{
	int var1;
	int var2;
	int var3;
	
	public ClassA() {
		this(1,2,3);
//		this.var1 = 1;
//		this.var2 = 2;
//		this.var3 = 3;
	}
	
	public ClassA(int var1, int var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public ClassA(int var1, int var2, int var3) { // 부모 생성자 
		super();
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
}

class ClassB extends ClassA{
	int a1;
	int a2;
	
	
//	public ClassB() {
//		
//	}
	
	
	public ClassB() {	
		super(1,2); // 부모의 생성자를 빌려쓰는거다
		
		this.a1 = 4;
		this.a2 = 5;
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		ClassB b = new ClassB();
		
		System.out.println(b.var1);
		System.out.println(b.var2);
		System.out.println(b.var3);
	}

}
