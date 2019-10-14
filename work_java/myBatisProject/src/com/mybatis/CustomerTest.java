package com.mybatis;

import java.io.Reader; //����� ������ Reader
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources; //Resources
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CustomerTest {

	public static void main(String[] args) {
		String conf = "res/Configuration.xml"; //myBatis �������� ���
		Reader reader;
		SqlSession session = null; //myBatis�� ���� �۾��� ���� �ʿ��� ��ü

		try {
			reader = Resources.getResourceAsReader(conf);// read conf xml file //�������Ͽ� �Է� ������ ����
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder(); //1. new�� ���� builder ����
			SqlSessionFactory factory = builder.build(reader); //2. .build()�� factory���� 
			session = factory.openSession(); //3. .openSession���� session���� -> Connection(��Ʈ��ũ ����) 1��
			List<Customer> list;
			
			// 1. select all data:
			// selectList: �������� ������ ������ ��
			list = session.selectList("selectAll"); // session.����Ҹ޼���("mapper file���� query id"); //namespace ����
			//list = session.selectList("Customer.selectAll"); //Mapper file�� "namespace"�� �������� �ʰ� �����־���. ��� ���̺��� ����ϴ��� ���
			//list = session.selectList("Board.selectAll"); 
			for (Customer rec : list) {
				System.out.println(rec.getNum() + "--" + rec.getName() + "--" + rec.getAddress());
			}
			
			System.out.println("-----------------------------------------------------");
			
			//2. select one
			//selectOne: �Ѱ��� ������ ������ ��
			Customer c = session.selectOne("Customer.selectOne", "111"); //(���� id, �Ķ����);
			System.out.println(c.getNum() + "--" + c.getName() + "--" + c.getAddress());
			
			System.out.println("-----------------------------------------------------");
			
/*			session.insert("Customer.insert", new Customer("901","william","seoul"));
			session.commit(); //dml(insert/delete/update)�� �ڵ����� commit�� ���� �ʴ´�! - Ŀ�Ծ��ϸ� �ڵ� �ѹ��
			
			session.delete("Customer.delete", "901");
			session.commit();*/
			
/*			//901�� ���ڵ��� �ּҸ� singapore�� ����
			Customer u = session.selectOne("selectOne","901");
			u.setAddress("singapore");
			session.update("update", u);
			session.commit();*/
						
/*			//901�� ���ڵ��� �ּҸ� firenze�� ���� (map�� ����ؼ�)
			HashMap<String,String> map = new HashMap<>();
			map.put("num", "901");
			map.put("address", "firenze");
			session.update("update2", map);
			session.commit();*/
			
			//�ּҰ� seoul�� ���ڵ�
			list = session.selectList("findAddress", "seoul");
			for (Customer rec : list) {
				System.out.println(rec.getNum() + "--" + rec.getName() + "--" + rec.getAddress());
			}
			
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			session.close();
		}
	}

}
