package e_Task01;

/*
 * 속성
 * 보유한 책 리스트 (최대 20권)
 * 보유한 회원 리스트 (최대 30명)
 * 현재 가입한 회원 수
 * 현재 등록한 책 수 
 * 
 * 기능
 * 회원 가입
 * 책 등록
 * 대여해주기
 * 책 반납
 * 등록된 회원 목록보기
 * 등록된 책 목록보기
 */

public class Library {
	Book[] libraryBookList; // 보유한 책 리스트
	Member[] libraryMemberList; // 보유한 회원 리스트
	int memberCnt; // 현재 가입한 회원 수
	int bookCnt; // 현재 등록한 책 수
	
	// 기본생성자
	public Library() {
		this.libraryBookList = new Book[20];
		this.libraryMemberList = new Member[30];
	}
	
//	회원 가입하기
//	가입 성공시 true를 반환, 가입 실패시 false 반환
	boolean join(Member member) {
		if(memberCnt < 29) {return false;}
		
		member.memberId = memberCnt;
		libraryMemberList[memberCnt] = member;
		
		memberCnt++;
		
		return false;			
	}
	
//	책 등록하기
	boolean bookRegister(Book book) { // 책 등록 (최대 20권)
		if(bookCnt > 19) { return false; }
		
		book.bookId = bookCnt;
		libraryBookList[bookCnt] = book;
		bookCnt++;
		
		return true;
	}
	
//  책 대여해주기
	
	boolean bookRental(int bookId, Member member) {
		Book book = libraryBookList[bookId];
		if(!book.status) { return false; }
//		코드의 흐름이 여기까지 왔다는것은 대여가 가능한 상태라는 의미이기에
//		대여처리 해야한다
		
//		대여는 회원의 북리스트에 저장을 해줘야하며, 해당 책의 상태값을 false로 반환해야한다.
//		단, 회원의 북리스트는 최대 3권이다
		
		for(int i=0; i<3; i++) {
			if(member.memberBookList[i] == null) {
				book.status = false;
				member.memberBookList[i] = book;
				return true;
			}
		}
		return false;
		
	}
	
//	책 반납
	void bookReturn(int bookId, Member member) {
		Book book = libraryBookList[bookId];
		
		book.status = true;
		
		Book[] bookList = member.memberBookList;
		
		for(int i=0; i<bookList.length; i++) {
			if(bookList[i] == null) {continue;} // bookList[i]가 null일때 continue로 아래코드로 내려간다
			
			if(bookList[i].bookId == bookId) {
				bookList[i] = null;
				return;
			}
		}
	}
	
//	등록된 회원 목록
	void showMemberList() {
		for(int i=0; i<libraryMemberList.length; i++) {
			Member member = libraryMemberList[i];
			
			if(member == null) { return; }
			
			member.showMemberInfo();
			member.showBookList();
		}
	}
	
//	등록된 책 목록
	void showBookList() {
		for(int i=0; i<libraryBookList.length; i++) {
			Book book = libraryBookList[i];
			
			if(book == null) { return; }
			
			book.showBookInfo();
		}
	}
	
	
	public static void main(String[] args) {
		
	}

}







