package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMySQLJoin {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		String user = "scott";
		String password = "tiger";
		
		//empid, fname, deptname(�μ����� ����� ����)
		//String query = "select empid, fname, deptname from emp e, dept d where e.deptid = d.deptid order by 1";
		//�̱��� �ִ� �μ� ����(deptid, deptname)
		String query = "select d.deptid, d.deptname, l.countryid from dept d, loc l"
				+ " where l.countryid = 'US' and "
				+ " d.locid = l.locid order by 1";
		
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
			String deptname = rs.getString(3);
			
			System.out.println(empid + "--" + fname + "--" + deptname);
		}
		
		//6. ������ 
		rs.close();
		stat.close();
		con.close();
	}
}
