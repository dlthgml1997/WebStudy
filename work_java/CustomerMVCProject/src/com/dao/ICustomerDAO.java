package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public interface ICustomerDAO {
	//db�۾��� �ϱ� ���� �ʿ��� Connection ��ü �����ؼ� ����
	Connection getConnection();
	
	//������ �۾� �޼ҵ�
	void close(Statement stat, ResultSet rs, Connection con, PreparedStatement pstat);
	
	//��絥���� �˻�
	ArrayList<Customer> selectAll();
	
	//��ȣ ���� �˻�
	Customer selectOne(String num);
	
	//�ּ� ���� �˻�
	ArrayList<Customer> findByAddress(String address);
	
	//�����ڵ� �߰�
	int insert(Customer c);
	
	//���ڵ� ����
	int update(String num, String address);
	
	//���ڵ� ����
	int delete(String num);	
	
	

}












