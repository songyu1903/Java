package c_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class UserDTO{
	private String loginId;
	private String name;
	private int age;

	public UserDTO(String loginId, String name, int age) {
		this.loginId = loginId;
		this.name = name;
		this.age = age;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
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
		return "UserDTO [loginId=" + loginId + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Ex05 {
	public static void main(String[] args) {
		UserDTO[] userDTOs = {
				new UserDTO("aaa", "김철수", 22),
				new UserDTO("bbb", "장희재", 33),
				new UserDTO("ccc", "김송호", 26),
		};
		
//		30살 이상만 나오게하는 List
//		List<UserDTO> userList = new ArrayList<>();
//		for(UserDTO dto : userDTOs) {
//			if(dto.getAge() >= 30) {
//				userList.add(dto);
//			}
//		}
//		
//		System.out.println(userList);
		
		
//		Stream 사용 코드
		List<UserDTO> userList =  Arrays.stream(userDTOs)
									.filter(dto -> dto.getAge() >=  30) // filter를 사용해 30살 이상이 나오게한다
									.collect(Collectors.toList()); // Collectors.toList 로 불변리스트로 바꾼다
		System.out.println(userList);

		Map<String, Integer> map =	Arrays.stream(userDTOs)
									.collect(Collectors.toMap(dto -> dto.getName() + "님", dto -> dto.getAge()));

		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
	}
}
