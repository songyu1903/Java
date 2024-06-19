package test;

// Student 클래스
public class Student implements Person{
	private String name;
	private int year;
	
	// 생성자
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public void study() {
		System.out.println(name + " " + year +"년쨰 공부 중");
	}
	
	@Override
	public void eat() {
		System.out.println(name + " 밥먹는 중");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
