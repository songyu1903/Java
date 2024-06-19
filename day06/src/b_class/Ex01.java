package b_class;

public class Ex01 {
	public static void main(String[] args) {
//		수학, 영어, 국어, 이름, 학점
		Student s1 = new Student();
		s1.math = 90;
		s1.eng = 70;
		s1.kor = 80;
		s1.name = "홍길동";
		
		System.out.println(s1.kor);
		System.out.println(s1.grade);
//		System.out.println(  s1.math  );
		
		
		Student s2 = new Student();
		s2.math = 100;
		s2.eng = 20;
		s2.kor = 30;
		
		System.out.println(s1.getAvg());
		System.out.println(s2.getAvg());
		
		
		
//		System.out.println(s2.math);
//		System.out.println( s1.getAvg() );
		
		System.out.println(s1);
		System.out.println(s2);
	}
}










