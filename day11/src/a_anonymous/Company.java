package a_anonymous;

import java.util.Random;

public class Company {
//	private 로 다른 클래스에서 사용 불가
	private String branch; // 지점

	public Company(String branch) {
		this.branch = branch;
	}

//	Upcasting
	public void register(Toy toy) {
		String[] list = toy.speakList(); // list 변수에 toy.speakList(); 를 넣음
		Random r = new Random();
		int index = r.nextInt(list.length); // list.lenght로 list[]에 있는 길이만큼 반환

		System.out.println(this.branch + "지점");
		for (int i = 0; i < list.length; i++) {
			System.out.println(i + 1 + ". " + list[i]);
		}
		System.out.println("===============================");
		
		toy.pushBtn(list[index]); // 랜덤으로 뽑은 값을 list[index]로 반환
		
	}
}
