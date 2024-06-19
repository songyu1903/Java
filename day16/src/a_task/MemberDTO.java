package a_task;

public class MemberDTO {
	private int memberId;    // 회원 고유번호
	private String loginId;  // 로그인 아이디
	private String password; // 로그인 패스워드
	private String name;	 // 이름
	private int age;   		 // 나이
	private String phoneNumber; // 폰 번호
	
	// 생성자
	public MemberDTO(int memberId, String loginId, String password, String name, int age, String phoneNumber) {
		this.memberId = memberId;
		this.loginId = loginId;
		this.password = password;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return  memberId + "," + loginId + "," + password + "," + name
				+ "," + age + "," + phoneNumber;
	}

//	1,aaa,1234,홍길동,12,010111212
	public static MemberDTO from(String line) { // from 메서드
		String[] arData = line.split(",");
		MemberDTO memberDTO = new MemberDTO(
				Integer.parseInt(arData[0]),
				arData[1],
				arData[2],
				arData[3],
				Integer.parseInt(arData[4]),
				arData[5]);
		
		return memberDTO;
	}

}



