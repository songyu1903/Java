package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.UserDTO;

public class UserDAO {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

//		아이디 중복검사
	public boolean checkLoginId(String loginId) {
//		sql 쿼리 만들기
//		문자열로 쿼리를 작성할때 주의 사항
//		1. 절대 ;을 포함하지 않는다.
//		2. 줄바꿈을 할 때 띄어쓰기를 주의한다
		String sql = "SELECT USER_ID FROM TBL_USER WHERE LOGIN_ID = ?";

		try {
			// 우리가 만든 DBConnecter 에서 커넥션 객체를 얻어온다. (DB와 연결 완료)
			conn = DBConnecter.getConnection();

			// 쿼리를 보내기 위한 PreparedStatement 객체를 커넥션 객체에서 받아온다.
			// 우리가 문자열로 작성한 쿼리가 PreparedStatement 에 들어가서 관리되고 있다.
			ps = conn.prepareStatement(sql);
			// 우리가 만든 쿼리는 현재 ?가 있다. (미완성 상태)
			// ?를 매개변수로 받은 loginId로 채워넣어야 한다.
			// PreparedStatement 의 기능으로 값을 채워 넣읗 수 있다.
			// set자료형 (물음표의 순서, 넣을 값);
			ps.setString(1, loginId);

			// 완성된 쿼리를 실행시키는 방법
			// 1. executeQuery();
			// SELECT 할 때 반환되는 결과를 받기 위해 사용
			// 2. executeUpdate();
			// SELECT를 제외하고 반환되는 값이 없으면 사용
			rs = ps.executeQuery();

			// resultSet 은 쿼리의 결과(테이블)를 저장하고 있다
			// 각 데이터에 접근하는 방식은 Iterator와 비슷하게 커서를 사용한다.
			// next() : 커서를 다음 행으로 이동시키고 true / false 를 반환한다.
			// get 자료형(칼럼번호) : 현재 커서가 가리키는 행의 칼럼번호로 데이터를 가져온다 -> getint(1)

			// resultSet.next() 는 안에 데이터가 있으면 return false를 해주고 없으면 return true를 해준다
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println(result);
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예상 못한 예외 발생!");
		} finally { // finally 는 상수값이다
//			jdbc에서 제공하는 객체들은 사용 후 닫아줘야 한다.
//			오류 여부와 상관없이 반드시 닫아야하므로 finally에 작성한다

//			닫을 때는 여는 순서와 반대로 닫는디ㅏ.
//			항상 null 체크를 해야한다
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	// 회원가입
	public void insertUser(UserDTO userDTO) {
		String sql = """
				INSERT INTO TBL_USER
				(USER_ID, LOGIN_ID, PASSWORD, NAME, AGE, GENDER, BIRTH)
				VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?)
				""";

		try {
			conn = DBConnecter.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, userDTO.getLoginId());
			ps.setString(2, userDTO.getPassword());
			ps.setString(3, userDTO.getName());
			ps.setInt(4, userDTO.getAge());
			ps.setString(5, userDTO.getGender());
			ps.setString(6, userDTO.getBirth());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insertUser() SQL 오류!!");
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 로그인
	public int selectUser(String loginId, String password) {
//		로그인 아이디와 패스워드를 전달받아 회원 번호(PK)를 조회한다.
		String sql = """
				SELECT USER_ID
				FROM TBL_USER
				WHERE LOGIN_ID = ? AND PASSWORD = ?
				""";
		// 처음에 userId 를 -1로 초기화
		int userId = -1;

		try {
			conn = DBConnecter.getConnection(); // 커넥션 객체 가져오기
			ps = conn.prepareStatement(sql); // preparStatement
			ps.setString(1, loginId);
			ps.setString(2, password);

			// executeQuery = SELECT 사용
			rs = ps.executeQuery();
			if (rs.next()) { // rs.next() 로 인해 true false 반환
				userId = rs.getInt(1); // 위에서 초기화를 했기때문에 바로 사용하면 된다
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SELECT SQL 오류 발생!!");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userId;
	}

	// 로그인 아이디 찾기(이름과 생일로 로그인 아이디를 조회하기 -> 결과가 2개 이상일 수 있다.)
	public List<String> selectLoginId(String name, String birth) {
		String sql = """
				SELECT LOGIN_ID
				FROM TBL_USER
				WHERE NAME = ? AND BIRTH = ?
				ORDER BY USER_ID
				""";

		// List 자료구조
		List<String> loginIdList = new ArrayList<>();

		try {
			conn = DBConnecter.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, birth);

			rs = ps.executeQuery();
			// 반복문을 사용해 다음 행을 체크후 true 면 계속 내려가다 false면 코드 종료
			while (rs.next()) {
				// String loginId 에 rs.getString(1)
				String loginId = rs.getString(1);
				// loginIdList 전체 목록 넣기
				loginIdList.add(loginId);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SELECT SQL 오류 발생!!");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return loginIdList;
	}

	// 회원 정보 수정
	public void update(UserDTO userDTO) {
		String sql = """
				UPDATE TBL_USER
				SET PASSWORD= ?, NAME= ?, AGE= ?, GENDER= ?, BIRTH= ? , USER_ID = ?
				WHERE USER_ID = 1
				""";
		try {
			conn = DBConnecter.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, userDTO.getPassword());
			ps.setString(2, userDTO.getName());
			ps.setInt(3, userDTO.getAge());
			ps.setString(4, userDTO.getGender());
			ps.setString(5, userDTO.getBirth());
			ps.setInt(6, userDTO.getUserId());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("update()에 UPDATE SQL 오류 발생!!");
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 회원 1명 전체 정보 조회(PK로 조회하기)
	// return 을 하기위해 반환 타입을 UserDTO로 받아온다
	public UserDTO selectUserById(int userId) {
//		가능하면 *을 사용하지 않는다.
		String sql = """
				SELECT USER_ID, LOGIN_ID, PASSWORD, NAME, AGE, GENDER, BIRTH
				FROM TBL_USER
				WHERE USER_ID = ?
				""";

		// null로 초기화
		UserDTO userDTO = null;

		try {
			conn = DBConnecter.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);

			// PK여서 무조건 한 행만 가져온다
			rs = ps.executeQuery();
			if (rs.next()) {
				userDTO = new UserDTO();
				userDTO.setUserId(rs.getInt(1));
				userDTO.setLoginId(rs.getString(2));
				userDTO.setPassword(rs.getString(3));
				userDTO.setName(rs.getString(4));
				userDTO.setAge(rs.getInt(5));
				userDTO.setGender(rs.getString(6));
				userDTO.setBirth(rs.getString(7));

			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("selectUserById() SELECT SQL 오류 발생!!");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userDTO;
	}

	// 회원 탈퇴(삭제)
	public boolean deleteUser(int userId) {
		String sql = """
				DELETE FROM TBL_USER
				WHERE USER_ID = ?
				""";
		int result = 0;
		
		try {
			conn = DBConnecter.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	
//	[실습]
//	생일을 전달받아 생일이 일치하는 전체 회원 정보를 조회하기
	public List<UserDTO> selectUserByBirth(String birth){
		String sql = """
				SELECT USER_ID, LOGIN_ID, PASSWORD, NAME, AGE, GENDER, BIRTH
				FROM TBL_USER
				WHERE BIRTH = ?
				""";
		
		// List목록 만들기
		List<UserDTO> userList = new ArrayList<>();
		
		try {
			conn = DBConnecter.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, birth);
			
			// ResultSet 
			rs = ps.executeQuery();
			
			// 반복문을 통해 생일이 일치하는 목록을 계속 찾는 문장
			while(rs.next()) {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserId(rs.getInt(1));
				userDTO.setLoginId(rs.getString(2));
				userDTO.setPassword(rs.getString(3));
				userDTO.setName(rs.getString(4));
				userDTO.setAge(rs.getInt(5));
				userDTO.setGender(rs.getString(6));
				userDTO.setBirth(rs.getString(7));
				
				userList.add(userDTO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("selectUserByBirth() SELECT SQL 오류!!");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}
	
}
