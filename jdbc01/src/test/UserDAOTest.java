package test;

import java.util.List;
import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class UserDAOTest {
	public static void main(String[] args) {
//		UserDAO userDAO = new UserDAO();
//		boolean isTrue = userDAO.checkLoginId("qqq");
//		System.out.println(isTrue);
		
//		insertUserTest();
//		selectUserTest();
//		selectLoginIdTest();
//		updateTest();
//		selectUserByIdTest();
//		deleteUserTest();
		selectUserByBirthTest();
	}
	
	
	public static void insertUserTest() {
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		
		userDTO.setLoginId("test");
		userDTO.setPassword("1234");
		userDTO.setName("test");
		userDTO.setAge(23);
		userDTO.setGender("F");
		userDTO.setBirth("2002-11-22");
		
		userDAO.insertUser(userDTO);
	}
	
	public static void selectUserTest() {
		UserDAO userDAO = new UserDAO();
		int userId = userDAO.selectUser("DDD", "1234");
		System.out.println(userId + "번 회원이 로그인 하였습니다!!");
	}
	
	public static void selectLoginIdTest() {
		UserDAO userDAO = new UserDAO();
		List<String> loginIdList = userDAO.selectLoginId("홍길동", "20000101");
		System.out.println("조회 목록!!");
		
		// 빠른 for문 사용
		for(String loginId : loginIdList) {
			System.out.println(loginId);
		}
	}
	
	public static void updateTest() {
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		
		userDTO.setUserId(1);
		userDTO.setPassword("1234");
		userDTO.setName("update");
		userDTO.setAge(1);
		userDTO.setGender("N");
		userDTO.setBirth("2023-10-20");
		
		userDAO.update(userDTO);
	}
	
	public static void selectUserByIdTest() {
		UserDAO userDAO = new UserDAO();
		UserDTO foundUser =  userDAO.selectUserById(1);
		
		System.out.println(foundUser);
	}
	
	public static void deleteUserTest() {
		UserDAO userDAO = new UserDAO();
//		userDAO.deleteUser(1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하고 싶은 회원");
		int deleteuser = sc.nextInt();
		
		boolean delete = userDAO.deleteUser(deleteuser);
		
		if(delete) {
			System.out.println("선택한 회원 삭제 완료!");
		} else {
			System.out.println("선택한 회원 정보가 없습니다!!");
		}
		sc.close();
	}
	
	
	public static void selectUserByBirthTest() {
		UserDAO userDAO = new UserDAO();
		// List 목록에서 생일이 20000101 회원을 가져와 조회
		List<UserDTO> userList = userDAO.selectUserByBirth("20000101");
//		System.out.println(userList);
		Scanner sc = new Scanner(System.in);
		System.out.println("생일 입력!!");
		String birth = sc.nextLine();
		
		
		
		userDAO.selectUserByBirth("2000-01-01")
			.forEach(System.out::println);
		
		
	}
}





