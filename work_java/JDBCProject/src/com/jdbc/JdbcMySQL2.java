package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMySQL2 {
//�μ� ��ȣ�� 50�̻��� ���ڵ��� ���, fname, email, deptid
	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		String query = "select empid, fname, email, deptid from emp where deptid >= 50";
		
		//1. Driver ���
		Class.forName(driver);
		
		//2. Connection ����
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. Statement ����
		Statement stat = con.createStatement();
		
		//4. Query ����
		ResultSet rs = stat.executeQuery(query);
		
		//5. ��� ó��
		while(rs.next()) {
			String empid = rs.getString(1);
			String fname = rs.getString(2);
			String email = rs.getString(3);
			String deptid = rs.getString(4);
			
			System.out.println(empid + "--" + fname + "--" + email+ "--" + deptid);
		}
		
		//6. ������ 
		rs.close();
		stat.close();
		con.close();
	}
}
