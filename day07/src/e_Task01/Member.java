package e_Task01;

/*
 * 속성
 * 회원 번호
 * 회원 이름
 * 전화 번호
 * 주소
 * 빌린 책 목록(최대 3권 대여 가능)
 * 
 * 기능
 * 빌린 책 목록을 출력하는 기능
 * 회원 정보 출력 기능
 * 
 */

public class Member {
	int memberId;
	String memberName;
	String phoneNumber;
	String address;
	
	Book[] memberBookList;
		
	public Member(String memberName, String phoneNumber, String address) {
		this.memberName = memberName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.memberBookList = new Book[3];
		
	}

	void showBookList() {
		
		System.out.println("+== 빌린 책 목록 ==+");
		for(int i = 0; i < memberBookList.length; i++) {
			// nullPointExpetion
			if(memberBookList[i] == null) {continue;} // memberBookList[i]가 만약에 null 이 있으면 게속 진행
			System.out.println("| "+memberBookList[i].bookName + " |"); // memberBookList[i]에 bookName을 출력
		}
		
		System.out.println("+==============+");
	}
	void showMemberInfo() {
		System.out.println(memberId + ". " + memberName);
		System.out.println("주소: " + address);
		System.out.println("핸드폰 번호: " + phoneNumber);
	}

	public static void main(String[] args) {
		
	}

}
