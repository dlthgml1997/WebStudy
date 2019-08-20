package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//batch(�������� �۾��� �ϳ��� ���� ��) ó�� + Transaction ó��(�ϳ��� ������ ������ ó���Ǿ�� �ϴ� �۾�)
public class InsertBatch {

	public static void main(String[] args){
		String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
		
		String user = "scott";
		String password = "tiger";
		
		Connection con = null; 
		Statement stat = null; //try catch �ٱ����� ����.
		
		try {
			//1. Driver ���
			Class.forName(driver);
			
			//2. Connection ����
			con = DriverManager.getConnection(url, user, password);
			
			//3. Statement ����
			stat = con.createStatement();
			
			//3-1. batch�� �۾� �߰�(stat�� query ��Ƴ���)
			stat.addBatch("insert into customer values(1,'queen','london')");
			stat.addBatch("insert into customer values(4,'king','la')");
			stat.addBatch("insert into customer values(2,'prince','seoul')");
			
			//3-2. auto-commit off
			con.setAutoCommit(false);
			
			//4. Query ����
			int[] x = stat.executeBatch(); //��ġ ����
			con.commit(); //�߰��� ������ ������ ��� batch�� ��� commit�Ѵ�.
			
			//5. ��� ó��
			System.out.println("commit all...");
		
		}catch(Exception w) { //�߰��� ������ �߻��ϸ� batch�� ��� rollback�ȴ�.
			try {
				con.rollback();
				System.out.println("rollback ����...");
			} catch (SQLException e) {
				System.out.println("rollback ����...");
			}
		}
		
		//6. ������ 
		try {
			stat.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("close ����...");
		}
	}
}
