package a_method;

public class Ex01 {
	public static void main(String[] args) {
		addTen(20);
		
		System.out.println(  addTen(20)  );
	}
	
//	어떤 숫자든 +10을 해주는 기능
	static int addTen(int num) {
		int result = num+10;
		return result;
	}
}
