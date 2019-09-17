package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//DAO:DB�� �����ؼ� CRUD(Create/Read/Update/Delete) �۾��� �����ϴ� ��ü
public class CustomerDAO implements ICustomerDAO {

	// FIELD
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";

	String user = "scott";
	String password = "tiger";

	// ������:1.Driver ���-> ������ ����� db ���
	public CustomerDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 2.Connection ���� - network ����
	@Override
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public ArrayList<Customer> selectAll() {
		String q = "select * from customer order by num";
		ArrayList<Customer> list = new ArrayList<>();

		try {
			Connection con = getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);

			while (rs.next()) {
				String num = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);

				Customer c = new Customer(num, name, address);
				list.add(c);
			}

			close(stat, rs, con, null);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Customer selectOne(String num) {
		String q = "select * from customer where num = ?";
		Connection con = getConnection();
		Customer c = null;

		try {
			PreparedStatement pstat = con.prepareStatement(q);
			pstat.setString(1, num);
			ResultSet rs = pstat.executeQuery();
			if (rs.next()) {// ****** �����Ͱ� �ִٸ�
				c = new Customer(rs.getString(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return c;
	}

	@Override
	public ArrayList<Customer> findByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String num, String address) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void close(Statement stat, ResultSet rs, Connection con, PreparedStatement pstat) {
		try {
			if (stat != null)
				stat.close();			
			if (pstat != null)
				pstat.close();
			
			if (rs != null)
				rs.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
