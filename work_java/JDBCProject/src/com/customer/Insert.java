package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//selectAll�� Ȯ��
public class Insert {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		//String query = "select num, name, address from customer where address = 'london'";
		String query = "insert into customer values(729, 'Genie', 'la');";
		System.out.println(query);
		
		//1. Driver ���
		Class.forName(driver);
		
		//2. Connection ����
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. Statement ����
		Statement stat = con.createStatement();
		
		//4. Query ����
		int x = stat.executeUpdate(query);
		
		//5. ��� ó��
		System.out.println(x+"���� ���ڵ� �߰�!!!");
		
		//6. ������ 
		stat.close();
		con.close();
	}
}
