package e_Task01;

/*
 * 속성
 * 도서 번호
 * 책 이름
 * 대여 상태
 * 
 * 기능
 * 책 정보 보기
 * 
 */

public class Book {
	int bookId;
	String bookName;
	boolean status; // true : 대여 가능, false : 대여 불가능

	public Book(String bookName) {
		this.bookName = bookName;
		this.status = true;
	}
	
//	책 정보 보기
	
	void showBookInfo() {
		System.out.println(bookId + ". " + bookName);
		System.out.println(status ? "대여 가능" : "대여 불가능");
	}

}
