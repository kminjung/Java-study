package test.util;
/*
 * 객체를 생성 한 후 메소드를 호출하면 Connection 객체를 리턴하는 클래스 설계하기
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	//필드
	private Connection conn;
	//생성자
	public DBConnect() {
		try {
			//오라클 드라이버 (jdb .jar 있어야 함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//@접속ip 주소: port번호 : DB이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";//DB 접속정보
			//.getConnection(url, 계정, 비밀번호))
			conn=DriverManager.getConnection(url,"scott","tiger");//DB 계정정보
			System.out.println("Oracle DB 접속 성공!");
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
	}
	//Connection 객체를 리턴해 주는 메소드
	public Connection getConn() {
		return conn;
	}
}
