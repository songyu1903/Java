package b_class;

public class Player {
	String name;
	int age;
	String position;
	String teamName;
	
	
	public Player(String name, int age, String position, String teamName) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.teamName = teamName;
	}
	void play() {
		System.out.println(name + "선수가 경기에 출전");
	}
	
	void standBy() {
		System.out.println(name + "선수가 밴치로 가게 되었습니다");
	}
	
}
