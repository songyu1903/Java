package a_anonymous;

public class Dog implements Toy{

	@Override
//	말하기 목록
	public String[] speakList() {
		String[] list = {
				"안녕!",
				"배고파 밥 먹자!",
				"왈왈!",
				"밥 먹었으면 양치하자!",
		};
		
		return list;
	}

	@Override
//	버튼
	public void pushBtn(String speak) {
		System.out.println(speak);
		
	}
	
}
