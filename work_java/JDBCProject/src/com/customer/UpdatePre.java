package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//selectAll�� Ȯ��
public class UpdatePre {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		String query = "update customer set address = ? where num = ?;";
		
		//1. Driver ���
		Class.forName(driver);
		
		//2. Connection ����
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. PreparedStatement ����
		PreparedStatement pstat = con.prepareStatement(query); //���κ��� ?�� ǥ���س��� query�׸�
		
		//3-1. ?�� �� setting
		pstat.setString(1, args[1]); //1��° ?�ڸ��� args[1]���� //������ �����ؼ� �ۼ��Ҽ� ����
		pstat.setString(2, args[0]);
		
		//4. Query ����
		int x = pstat.executeUpdate();//pstat�� ���⿡ query�� ����
		
		//5. ��� ó��
		System.out.println(x+"���� ���ڵ� ����!!!");
		
		//6. ������ 
		pstat.close();
		con.close();
	}
}
