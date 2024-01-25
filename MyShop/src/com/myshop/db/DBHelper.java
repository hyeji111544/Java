package com.myshop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {

	// DB자원
		protected Connection conn = null;
		protected Statement stmt = null;
		protected PreparedStatement psmt = null;
		protected ResultSet rs = null;
	
	// DB정보
		private String host = "jdbc:mysql://127.0.0.1:3306/shop";
		private String user = "hyeji";
		private String pass = "abc1234";
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		
		// 1단계
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2단계
		return DriverManager.getConnection(host, user, pass);
	}
	
	public void close() throws SQLException{
		
		if(rs != null) {
			rs.close();
		}
		if(stmt !=null) {
			stmt.close();
		}
		if(psmt !=null) {
			psmt.close();
		}
		if(conn !=null) {
			conn.close();
		}
		
	}

}
