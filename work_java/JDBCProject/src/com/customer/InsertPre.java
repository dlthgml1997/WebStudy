package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//query
public class InsertPre {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		//String query = "insert into customer values(" + args[0] +",'"+ args[1] +"','"+ args[2] + "');"; //���⼭ ������ ���� �߻��Ѵ�
		String query = "insert into customer values(?,?,?);";
		//System.out.println(query);
		
		//1. Driver ���
		Class.forName(driver);
		
		//2. Connection ����
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. PreparedStatement ���� //PreparedStatement : ������ �������� �Ϻΰ� �̸� ����ִ� �׸�
		//Statement stat = con.createStatement(); 
		PreparedStatement pstat = con.prepareStatement(query); //���κ��� ?�� ǥ���س��� query�׸�
		
		//3-1. ?�� �� setting //�÷����� �ȵ�!!
		pstat.setString(1, args[0]); //1��° ?�ڸ��� args[0]���� ����ǥ�� �˾Ƽ���
		pstat.setString(2, args[1]);
		pstat.setString(3, args[2]);
		
		//4. Query ����
		int x = pstat.executeUpdate(); //���⿡ query�� ����
		
		//5. ��� ó��
		System.out.println(x+"���� ���ڵ� �߰�!!!");
		
		//6. ������ 
		pstat.close();
		con.close();
	}
}
