package sub3;

/*
 *  날짜 : 2024/01/23
 *  이름 : 윤혜지
 *  내용 : PreparedStatment 실습하기
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparelDeleteTest {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "hyeji";
		String pass = "abc1234";
			
			try {
				//1단계 -드라이버 로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				//2단계 - DB 접속
				Connection conn = DriverManager.getConnection(host, user, pass);
				//3단계 - SQL 실행객체 생성
				String sql = "DELETE FROM `User1` WHERE `uid`=?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, "B101");
				//4단계 - SQL실행
				psmt.executeUpdate();
				//5단계 -
				//6단계 -
				psmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("DELETE 완료...");
				
				
	}

}
