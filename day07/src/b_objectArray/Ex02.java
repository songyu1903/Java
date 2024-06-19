package b_objectArray;

class Member{
	int id; // 회원번호
	String name; // 이름
	int age; // 나이
	String address; // 주소

	public Member(int id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void showInfo() {
		System.out.println(id + ". " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
//		member1 참조변수는 1번회원의 객체의 주소를 저장하고있다. (100번지)
		Member member1 = new Member(1, "짱구", 5, "강남");
		Member member2 = new Member(2, "송호", 26, "강북");
		Member member3 = new Member(3, "희재", 33, "노원");
				
		member1.showInfo();
//		members 참조변수는 3칸짜리 배열을 가리킨다.
//		3칸짜리 배열의 각 칸에는 Member 객체의 주소를 저장하고 있다
//							{100번지,  200번지,  300번지}
		Member[] members = {member1, member2, member3};
		System.out.println(members);
		System.out.println(member1);
		System.out.println("=================");
//		members[0]은 100번지를 의미한다.(100번지에 있는 객체에 접근하는것)
		members[0].showInfo();
		
		for(int i = 0; i < members.length/*members.length의 길이까지*/; i++) {
			members[i].showInfo();
		}
	}

}
