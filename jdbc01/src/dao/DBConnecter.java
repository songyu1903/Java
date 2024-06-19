package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB 연결 담당
public class DBConnecter {
	public static void main(String[] args) {
		getConnection();
	}

	public static Connection getConnection() {
		Connection conn = null;

		try {
			String userName = "pm";
			String userPassword = "1234";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			// 드라이버 로드 (OracleDriver 객체를 메모리에 올린다)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 객체를 드라이버 매니저를 통해 얻어온다
			// 드라이버 매니저는 드라이버를 관리해준다.
			// 우리가 위에서 메모리에 할당한 오라클 드라이버 객체를 이용하여 DBMS에 연결하고
			// connection 객체를 반환해준다.
			conn = DriverManager.getConnection(url, userName, userPassword);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 클래스를 찾지 못함");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예상못한 예외 발생!");
		}

		return conn;
	}
}
