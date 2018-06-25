package test.main;

import java.sql.Connection; //DB 연결객체
import java.sql.DriverManager;
import java.sql.PreparedStatement;//
import java.sql.ResultSet;//
import java.sql.SQLException;

/*
 *  JDBC (Java Database Connectivity) 
 *  
 *  - java 에서의 DataBase 연동 프로그래밍 연습
 *  - Oracle Database 를 연동하려면 ojdbc6.jar 파일이 사용가능한
 *    위치에 있어야 한다. DB 연동하기 위한 드라이버 클래스가 
 *    ojdbc6.jar 파일에 들어 있다. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Connection conn=null;
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
		
		//필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="SELECT num,name,addr From member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
/*
 * PreparedStatement (준비가 된 서술?)
 *  - SQL구문을 실행시키는 기능을 갖는 객체
 * 	   한번 사용한 SQL문이 저장되서 반복해서 사용할 경우 성능이 좋기 때문에 일반적으로는 PreparedStatement를 사용한다.
 * 	   
 * 
 */
