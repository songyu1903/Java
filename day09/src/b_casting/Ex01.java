package b_casting;

class Tv{ // 부모 클래스
	int vol;
	int ch;
	
	void chUp() {}
	void chDown() {}
}

class SmartTv extends Tv{ // 자식 클래스
	void netflix() {}
}

public class Ex01 {
	public static void main(String[] args) {
//		★★ Up Casting ★★
//		SmartTv smartTv = new SmartTv();
//		Tv tv = (Tv)smartTv;
		
//		Tv tv = (Tv)new SmartTv();
		
		Tv tv = new SmartTv();
//		부모 클래스 타입의 참조변수로 자식클래스 타입의 객체를 참조한다(가리키게 한다.)
		
		tv.ch = 3;
		tv.vol = 100;
		tv.chDown();
//		tv.netflix(); 안됨!;
		
//		★★ Down Casting ★★
		SmartTv smartTv = (SmartTv)tv;
		System.out.println(smartTv.ch);
//		다운 캐스팅은 반드시 업 캐스팅 된 값으로 해야한다
//		즉, 업 캐스팅된 값을 다시 원래의 자식타입으로 돌리는 것은 다운 캐스팅이다.
		
//		잘못된 다운 캐스팅
//		SmartTv smartTv = (SmartTv)new Tv(); // 오류 발생!!
		
	}
}
