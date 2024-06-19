package b_collection_task;

public class UserDAOTest {
	public static void main(String[] args) {
		System.out.println("test");
		joinTest();
	}
	
	static void joinTest() {
		UserDAO userDAO = new UserDAO();
		
		UserDTO userDTO = new UserDTO("test", "1234", "test", 22);
		userDAO.join(userDTO);
	}
}











