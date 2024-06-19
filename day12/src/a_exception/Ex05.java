package a_exception;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("예외를 발생");
//		throw new NumberFormatException();
	
				try {
					login("admin","1235");
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	static int login(String loginId, String pw) throws LoginException{
		if("admin".equals(loginId) && "1234".equals(pw)) {
			return 33;
		}
		
		throw new LoginException("유효하지 않는 회원 정보");
	}
}
