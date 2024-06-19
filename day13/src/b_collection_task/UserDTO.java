package b_collection_task;

public class UserDTO {
	private String loginId;
	private String pw;
	private String name;
	private int age;
	
	public UserDTO() {}
	
	public UserDTO(String loginId, String pw, String name, int age) {
		this.loginId = loginId;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	@Override
	public String toString() {
		return "UserDTO [loginId=" + loginId + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
}












