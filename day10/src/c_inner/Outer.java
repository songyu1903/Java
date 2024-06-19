package c_inner;

public class Outer {
	int instanceVar;
	static int staticVar;
	
	class InstanceInner{
		
	}
	
	static class StaticInner{
		
	}
	
	void instanceMethod() {
		int localVar; // 지역 변수
		
		InstanceInner ii = new InstanceInner();
		
		class LocalInner {
			
		}
		
		LocalInner li = new LocalInner();
		
		StaticInner si = new StaticInner();
		
	}
	void method2() {
		InstanceInner ii = new InstanceInner();
	}
}
