package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//customer table�� ��� ������ ��� //Ȯ��
public class selectAll {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		String query = "select num, name, address from customer";
		
		//1. Driver ��� -> ������ ����� db ���(mysql, oracle ��)
		Class.forName(driver);
		
		//2. Connection ����
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println(con); //com.mysql.cj.jdbc.ConnectionImpl //java.sql.Connection�� �ƴ�
		
		//3. Statement ����
		Statement stat = con.createStatement();
		System.out.println(stat); //com.mysql.cj.jdbc.StatementImpl
		
		//4. Query ����
		ResultSet rs = stat.executeQuery(query);
		
		//5. ��� ó��
		while(rs.next()) {
			String num = rs.getString(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			
			System.out.println(num + "--" + name + "--" + address);
		}
		
		//6. ������ 
		rs.close();
		stat.close();
		con.close();
	}
}
