package com.jdbc;

import java.sql.*;

public class JdbcExecute {

	public static void main(String args[]) {
/*		String driver = "oracle.jdbc.driver.OracleDriver";
		String db_connect = new String("jdbc:oracle:thin:@127.0.0.1:1521:ORCL"); //����Ŭ�� url
		String db_user = new String("scott");
		String db_passwd = new String("tiger"); */
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		String user = "scott";
		String password = "tiger";
		
		String str1 = "select * from customer";
		String str2 = "insert into customer values(987,'hee','la')";

		Connection conn;
		Statement stat;
		try {
			//1. Driver ���
			Class.forName(driver);
			//2. Connection ����
			conn = DriverManager.getConnection (url, user, password);
			
			//3. Statement ����
			stat = conn.createStatement();

			//4. Query ���� : execute()�� �������� select���� �ƴϾ ������� -> ���� boolean
			boolean flag = stat.execute(str1); //select o -> stat.executeQuery(str1) -> ResultSet
	//		boolean flag = stat.execute(str2); //select x -> stat.executeUpdate(str2) -> int

			if(flag == true){ //select�� ������ ��� true�� return
				ResultSet rs = stat.getResultSet(); //�� �޼���� ResultSet�� ���� ���� ��

				while(rs.next()) {
					String num  = rs.getString(1);
					String name  = rs.getString(2);
					String address   = rs.getString(3);
					System.out.println(num + "-- " +name + "-- " + address );
				}
			}			
			else{ //select�� �������� ���� ��� false�� return
				int rows = stat.getUpdateCount(); //�� �޼���� int���� ���� �� �� �ִ�.
				if (rows != 0)
					System.out.println("operation ok....!!!");
				else 
					System.out.println("no changes made...!!!");
			}
			stat.close();
			conn.close();
		} catch ( Exception e ) {
			System.out.println(" error sql");
			e.printStackTrace();
		}
	}
}