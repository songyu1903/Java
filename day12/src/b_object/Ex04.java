package b_object;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) { return true; }
//		if(obj instanceof Person) {
//			Person other = (Person)obj; // 다운캐스팅
//			
//			if(this.name.length() == other.name.length()) {
//				for(int i = 0; i < this.name.length(); i++) {
//					if(this.name.charAt(i) != other.name.charAt(i)) {
//						return false;
//					}
//				}
//				
//				return true && this.age == other.age; // this의 age와 other에 age가 같아야 true가 나온다
//			}
//		}
//		return false;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) { return true; }
		
		if(obj instanceof Person) {
			Person other = (Person)obj;
			return this.name.equals(other.name) && this.age == other.age;
		}
		
		return false;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Person p1 = new Person("철수", 22);
		Person p2 = new Person("영희", 20);
		Person p3 = new Person("철수", 22);
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3)); // 재정의 된 equals 덕분에 true 가 나온다
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());

		
	}
}
