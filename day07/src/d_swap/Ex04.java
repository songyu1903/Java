package d_swap;

class Student{
	int math;
	int kor;
}

public class Ex04 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.math = 10;
		s1.kor = 20;
		
//		pass by value : 값을 복제하여 넘겨준다
//		call by value
		swap(s1);
		
		System.out.println(s1.math);
		System.out.println(s1.kor);
	}

	static void swap(Student s1) {
		int tmp = 0;
		tmp = s1.math;
		s1.math = s1.kor;
		s1.kor = tmp;
	}
}
