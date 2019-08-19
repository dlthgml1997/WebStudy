package com.customer;
//�ּҰ� london�� ���ڵ� ���
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//customer table�� ��� ������ ���
public class selectAddress {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		String query = "select num, name, address from customer where address = 'london'";
		
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
