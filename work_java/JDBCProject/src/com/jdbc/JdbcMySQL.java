package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMySQL {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		//jdbc url
		//jdbc�� protocol name, mysql�� db�̸�, localhost(db�� �ִ� ip�ּҸ� �Է�)�� db server �ּ�, 3306�� port��ȣ, scott�� schema �̸�
		//UTC�� ǥ�ؽø� �ǹ�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		String query = "select empid, fname, phone from emp";
		
		//1. Driver ���
		Class.forName(driver); 	//Ŭ�����̸����� �ٷ� ȣ���ϴ� ����ƽ �޼��� forname()
								//forname("��Ű���̸�.Ŭ�����̸�");�ϸ� �� Ŭ������ new�ȴ�. = "��ü����"
								//���� oracle�� ����̹��� ����� ���, args[1]���� �ؼ� �ٸ� ����̹� ��ü ������ �Ѵ�. (�������� ��ü ������ �� �� ����)
								//����̹� �� ��ǥ�� "���� Ŭ����"�� driver�� ����(���)�س����� �ٸ� Ŭ�������� �ڵ����� �����ǹǷ� �Ű�X
		
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
			String phone = rs.getString(3);
			
			System.out.println(empid + "--" + fname + "--" + phone);
		}
		
		//6. ������ 
		rs.close();
		stat.close();
		con.close();
	}
}
