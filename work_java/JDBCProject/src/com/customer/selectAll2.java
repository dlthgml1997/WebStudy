package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//customer table�� ��� ������ ��� //Ȯ��
public class selectAll2 {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		String query = "select * from customer";
		
		//1. Driver ���
		Class.forName(driver);
		
		//2. Connection ����
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. Statement ����
		Statement stat = con.createStatement();
		
		//4. Query ����
		ResultSet rs = stat.executeQuery(query);
		rs.last(); //rs�� ������ ���ڵ� ���� ����Ŵ
		System.out.println(rs.getRow()); //�� ���� ��ȣ = rs���� ���ڵ� ����
		rs.beforeFirst(); //�ٽ� ������(0��° ��)�� ����Ŵ
		
		//5. ��� ó��
		while(rs.next()) {
			String num = rs.getString(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			
			System.out.println(num + "--" + name + "--" + address);
		}
		
		//rs���̺��� �������� "�Ʒ�"���� ���� ���
/*		System.out.println("-------------");
		rs.previous(); //�� �� �ö󰡼� rs�� ������ ���ڵ� ���� ����Ŵ
		System.out.println(rs.getString(1) + "--" + rs.getString(2));
		System.out.println(rs.getRow());  //�� ���� ��ȣ = rs���� ���ڵ� ����
		*/
		
		while(rs.previous()) {
			String num = rs.getString(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			
			System.out.println(num + "--" + name + "--" + address);
		}
		
		System.out.println("-------------");
		rs.first(); //rs.�� ù ������ ��
		System.out.println(rs.getString(1) + "--" + rs.getString(2));
		
		

		//6. ������ 
		rs.close();
		stat.close();
		con.close();
	}
}
