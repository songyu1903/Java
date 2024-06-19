package a_anonymous;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		String[] ar = dog.speakList();
		
		Company c1 = new Company("서울");
		Company c2 = new Company("부산");
		
		Dog dog = new Dog();
		c1.register(dog); // 강아지 장난감이 서울지점에 들어감
		
		Toy t1 = new Toy() {
			
			@Override
			public String[] speakList() {
				String[] list = {
					"야옹!",
					"배고파!",
					"밥줘!",
					"니가 좋아!"
				};
				return list;
			}
			
			@Override
			public void pushBtn(String speak) {
				System.out.println(speak);
			}
		};
		
		c1.register(t1);
		
//		변수에 따로 저장안하고 바로 익명클래스를 사용해 일회성으로 객체 생성
		c2.register(new Toy() {
			@Override
			public String[] speakList() {
				String[] list = {
						"t1",
						"t2",
						"t3"
				};
				return list;
			}
			
			@Override
			public void pushBtn(String speak) {
				System.out.println(speak);
			}
		});
		
		c2.register(new ToyAdapter() { 
			@Override
			public String[] speakList() {
				String[] list = {};
				return list;
			}
		});
		
		
	}
}





















