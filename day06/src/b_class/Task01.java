package b_class;

/*
 * 선수를 관리하는 프로그램을 만들고 싶다.
 * 선수(Player) 클래스를 만들고
 * 선수의 이름, 나이, 포지션, 팀이름을 저장해야한다.
 * 
 * 기능 : 출전(play), 대기(standBy) 를 만든다.
 * 출전 : "OOO선수가 경기에 출전한다." 출력
 * 대기 : "OOO선수가 벤치에서 대기한다." 출력
 */

public class Task01 {
	public static void main(String[] args) {
		
		Player p2 = new Player("김송호", 26, "ST", "FC서울");
		p2.play();
		p2.standBy();
		
		Player p3 = new Player("이즈", 0, null, "FC서울");
		
//		Player p1 = new Player();
//		p1.name = "김송호";
//		p1.age = 26;
//		p1.position = "ST";
//		p1.teamName = "FC서울";
	}
}
