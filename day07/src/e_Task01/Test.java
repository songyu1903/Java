package e_Task01;

// 테스트 클래스
public class Test {

	public static void main(String[] args) {
//		bookTest();
//		memberTest();
//		libraryJoinTest();
//		libraryBookRegisterTest();

//		libraryBookRentalTest();
		
//		도서관 생성
		Library library = new Library();
		
//		회원 생성
		Member m1 = new Member("철수", "010,1234,5678", "노원구");
		Member m2 = new Member("영희", "010,6434,1246", "강남구");
		Member m3 = new Member("웅이", "010,5928,7653", "강북구");
		
//		책 생성
		Book b1 = new Book("Java 시리즈");
		Book b2 = new Book("Python 시리즈");
		Book b3 = new Book("Linux 시리즈");
		
//		회원 등록
		library.join(m1);
		library.join(m2);
		library.join(m3);
		
//		책 등록
		library.bookRegister(b1);
		library.bookRegister(b2);
		library.bookRegister(b3);
		
//		확인하기
//		library.showBookList();
//		library.showMemberList();
		
		library.bookRental(0, m3);
		library.bookRental(3, m2);
		library.bookRental(2, m3);
		library.bookRental(1, m1);
		
		library.showBookList();
		System.out.println();
		System.out.println();
		library.showMemberList();
		
//		반납 대여
		library.bookReturn(0, m3);
		library.bookRental(0, m1);
		
		library.showBookList();
	}
	

	
	static void libraryBookRentalTest() {
		Library library = new Library();
		
		Member member = new Member("김송호", "010", "test");
		Member member2 = new Member("장희재", "010", "test2");
		
		library.join(member);
		library.join(member2);
		
		library.bookRegister(new Book("어린 왕자"));
		library.bookRegister(new Book("헤리포터 와 마법사의돌"));
		library.bookRegister(new Book("달빛 조각사"));
		library.bookRegister(new Book("나 혼자만 레벨업"));
		
		library.bookRental(0, member);
		library.bookRental(1, member);
		library.bookRental(2, member);
		library.bookRental(3, member);
		
		library.bookReturn(1, member);
		library.bookReturn(2, member);
		
		library.bookRental(2, member2);
		library.bookRental(3, member2);
		
		
		member.showBookList();
		member2.showBookList();
	}
	
	static void libraryBookRegisterTest() {
		Library library = new Library();
		
		for(int i = 0; i < 25; i++) {
			boolean result = library.bookRegister(new Book("test" + i));
			System.out.println(result);
		}
		
		library.bookRegister(null);
		
	}
	
	static void libraryJoinTest() {
		Library library = new Library();
		
		for(int i = 0; i < 30; i++) {
			Member joinmember = new Member("test" + i, "010", "test" + i);
			boolean result = library.join(joinmember);
			System.out.println(result);
		}
	}
	
	static void memberTest() {
		Member member = new Member("test", "010-9205-7065", "강북구");
		Book[] list = member.memberBookList; // memberBookList 배열을 list라는 변수에 담았다
		list[0] = new Book("test book1");
		list[1] = new Book("test book2");
		member.showBookList();
		member.showMemberInfo();
	}
	
	static void bookTest() {
		Book book = new Book("어린 왕자");
		book.showBookInfo();
	}
}

