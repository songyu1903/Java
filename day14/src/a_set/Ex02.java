package a_set;

import java.util.HashSet;
import java.util.Set;

class Student{
	private int num;
	private String name;
	
	// 생성자
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) { return true; }
		
		if(obj instanceof Student) {
			return this.num == ((Student)obj).num;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.num;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Set<Student> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		
		System.out.println(set.size());
	}
}









