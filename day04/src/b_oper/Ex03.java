package b_oper;

public class Ex03 {

	public static void main(String[] args) {
		// 증감 연산자
		// ++, --
		
		// 전위형 : 증감을 먼저하고 사용된다.
		// ++data, --data
		
		// 후위형 : 사용을 먼저하고 증감된다.
		// data++, data--
		
		int data = 0;
//		data++;
		System.out.println(data++); // 후위형을 많이 사용한다
//		System.out.println(++data);
	}

}
