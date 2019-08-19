package com.tier3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//<DAO> : DB�� �����ؼ� CRUD(Create/Read/Update/Delete) �۾��� �����ϴ� ��ü
public class CustomerDAO implements ICustomerDAO { //�ʵ�, ������, �������̵�
	
	//FIELD
	String driver = "com.mysql.cj.jdbc.Driver"; //��Ű���̸�.Ŭ�����̸�
	String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC&characterEncoding=UTF-8";
	
	String user = "scott";
	String password = "tiger";
	
	//������ //Ŭ���̾�Ʈ���� ����
	public CustomerDAO() {
		//1. Driver ���(�ѹ��� �ϸ� ��)
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) { //driverŬ������ ��ã�� ���
			e.printStackTrace();
		}
	}
	
	@Override
	public Connection getConnection() {//2. Connection ����
		Connection con = null; //Ʈ����ĳġ �ٱ����� null�� �켱 �ʱ�ȭ�ؾ� ����X!!!
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con; //������ Ʈ����ĳġ �ٱ����� ���־����!(�ͼ��� �߻��ϴ��� ĳġ ���� �� ������ �ǵ���!!!!)
					//�ͼ��� �߻��� null�� ������ ��
	}

	@Override
	public ArrayList<Customer> selectAll() {
		String q = "select * from customer order by num";
		ArrayList<Customer> list = new ArrayList<>();
		//2. Connection ����
		Connection con = getConnection(); //���� �ۼ��� �޼��� �̿�
		try {
			//3. Statement ����
			Statement stat = con.createStatement();
			//4. Query ����
			ResultSet rs = stat.executeQuery(q);
			
			//5. ��� ó��
			while(rs.next()) {
				String num = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				
				//System.out.println(num + "--" + name + "--" + address); //����� Ŭ���̾�Ʈ���� �ϴ� ��
				Customer c = new Customer(num, name, address);
				list.add(c);
			}
			//6. ������ 
			close(stat, rs, con, null);//�Ʒ� �ۼ��� �޼��� �̿�
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Customer selectOne(String num) {
		String q = "select * from customer where num = ?";
		//2. Connection ����
		Connection con = getConnection();
		Customer c = null;
		
		try {
			//3. PreparedStatement ���� 
			PreparedStatement pstat = con.prepareStatement(q);
			//3-1. ?�� �� setting //�÷����� �ȵ�!!
			pstat.setString(1, num); 
			//4. Query ����
			ResultSet rs = pstat.executeQuery();
			//5. ��� ó��
			if(rs.next()) { //���� ������ (ù��°) ���ڵ� ����Ű���� ȣ���� //�����Ͱ� �ִٸ�!!!!
				c = new Customer(rs.getString(1), rs.getString(2), rs.getString(3));
			}
			//6. ������ 
			close(null, rs, con, pstat);//�Ʒ� �ۼ��� �޼��� �̿�
		}catch(SQLException e){
			e.printStackTrace();
		}

		return c;
	}

	@Override
	public ArrayList<Customer> findByAddress(String address) {
		String q = "select * from customer where address = ?";
		ArrayList<Customer> list = new ArrayList<>();
		//2. Connection ����
		Connection con = getConnection();
		try {
			//3. PreparedStatement ���� 
			PreparedStatement pstat = con.prepareStatement(q);
			//3-1. ?�� �� setting //�÷����� �ȵ�!!
			pstat.setString(1, address); 
			//4. Query ����
			ResultSet rs = pstat.executeQuery();
			//5. ��� ó��
			while(rs.next()) {
				String num = rs.getString(1);
				String name = rs.getString(2);
				String address1 = rs.getString(3);
				
				//System.out.println(num + "--" + name + "--" + address); //����� Ŭ���̾�Ʈ���� �ϴ� ��
				Customer c = new Customer(num, name, address1);
				list.add(c);
			}
			//6. ������ 
			close(null, rs, con, pstat);
		}catch(SQLException e){
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int insert(Customer c) {
		String query = "insert into customer values(?,?,?);";
		//2. Connection ����
		Connection con = getConnection();
		int x = 0;
		
		try {
			//3. PreparedStatement ���� 
			PreparedStatement pstat = con.prepareStatement(query);
			//3-1. ?�� �� setting //�÷����� �ȵ�!!
			pstat.setString(1, c.getNum()); 
			pstat.setString(2, c.getName());
			pstat.setString(3, c.getAddress());
			//4. Query ����
			x = pstat.executeUpdate();
			//5. ��� ó��
			//System.out.println(x+"���� ���ڵ� �߰�!!!");
			//6. ������ 
			close(null, null, con, pstat);//�Ʒ� �ۼ��� �޼��� �̿�
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return x;
	}

	@Override
	public int update(String num, String address) {
		String query = "update customer set address = ? where num = ?;";
		//2. Connection ����
		Connection con = getConnection();
		int x = 0;
		
		try {
			//3. PreparedStatement ���� 
			PreparedStatement pstat = con.prepareStatement(query);
			//3-1. ?�� �� setting //�÷����� �ȵ�!!
			pstat.setString(1, address); 
			pstat.setString(2, num);
			//4. Query ����
			x = pstat.executeUpdate();
			//5. ��� ó��
			//System.out.println(x+"���� ���ڵ� ����!!!");
			//6. ������ 
			close(null, null, con, pstat);//�Ʒ� �ۼ��� �޼��� �̿�
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return x;
	}

	@Override
	public int delete(String num) {
		String query = "delete from customer where num = ?;";
		//2. Connection ����
		Connection con = getConnection();
		int x = 0;
		
		try {
			//3. PreparedStatement ���� 
			PreparedStatement pstat = con.prepareStatement(query);
			//3-1. ?�� �� setting //�÷����� �ȵ�!!
			pstat.setString(1, num); 
			//4. Query ����
			x = pstat.executeUpdate();
			//5. ��� ó��
			//System.out.println(x+"���� ���ڵ� ����!!!");
			//6. ������ 
			close(null, null, con, pstat);//�Ʒ� �ۼ��� �޼��� �̿�
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return x;
	}

	@Override
	public void close(Statement stat, ResultSet rs, Connection con, PreparedStatement pstat) { //6. ������ 
		try {
			if(stat!=null)
				stat.close();
			if(pstat!=null)
				pstat.close();
			if(rs!=null)
				rs.close();
			if(con!=null)
				con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
