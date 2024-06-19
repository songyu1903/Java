package b_collection_task;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
//	모든 회원정보를 저장하는 리스트
	private List<UserDTO> userList = new ArrayList<UserDTO>();

//	회원가입
	public void join(UserDTO userDTO) {
		userList.add(userDTO);
	}
	
	
}













