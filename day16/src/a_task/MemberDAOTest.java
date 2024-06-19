package a_task;

import java.io.IOException;
import java.util.List;

public class MemberDAOTest {
	static MemberDAO memberDAO = new MemberDAO();
	
	public static void main(String[] args) {
//		joinTest();
//		checkLoginIdTest();
//		findLoginId();
		
		findPassword();
	}
	
	static void findPassword() {
		try {
			String password = memberDAO.findPassword("ddd","01092057065");
			System.out.println(password);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void findLoginId() {
		try {
			List<String> loginIdList = memberDAO.findLoginId("01092057065");
			System.out.println(loginIdList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void checkLoginIdTest() {
		try {
			boolean isOK = memberDAO.checkLoginId("AAA");
			System.out.println(isOK);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	static void joinTest() {
		MemberDTO member = new MemberDTO(5, "ddd", "7777", "김송호", 26, "01092057065");
		 try {
			memberDAO.join(member);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
