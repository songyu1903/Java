package test;

// Employee 클래스
public class Employee implements Person{
	private String name;
	private int career; 
	
	// 생성자
	public Employee(String name, int career) {
		this.name = name;
		this.career = career;
	}

	public void work() {
		System.out.println(name + " " + career +"년째 일하는 중");
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

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
}
