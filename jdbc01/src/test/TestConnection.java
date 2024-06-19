package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnection {
	public static void main(String[] args) {
		testMethod();
	}
	
//	연결 메서드
	public static void testMethod() {
		Connection conn = null;

		String userName = "pm";
		String userPassword = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 객체를 드라이버 매니저를 통해 얻어온다.
			// 드라이버 매니저는 드라이버를 관리해준다
			// 우리가 위에서 메모리에 할당한 오라클 드라이버 객체를 이용하여 DBMS에 연결
			// connection 객체를 반환해준다
			conn = DriverManager.getConnection(url, userName, userPassword);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 연결 실패!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 정보 오류!");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("알 수 없는 오류 발생!!");
		}
		System.out.println("연결 성공!!!");
		
//		쿼리 만들기
		String sql = "SELECT SYSDATE FROM DUAL";
		
		String result;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			result = rs.getString(1);
			System.out.println(result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
