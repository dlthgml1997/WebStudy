package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//selectAll�� Ȯ��
public class Delete {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		String query = "delete from customer where num = 729;";
		
		//1. Driver ���
		Class.forName(driver);
		
		//2. Connection ����
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. Statement ����
		Statement stat = con.createStatement();
		
		//4. Query ����
		int x = stat.executeUpdate(query);
		
		//5. ��� ó��
		System.out.println(x+"���� ���ڵ� ����!!!");
		
		//6. ������ 
		stat.close();
		con.close();
	}
}
