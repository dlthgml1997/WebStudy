package com.ssafy;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Magazine m = new Magazine();
		
		b1.isbn = "21424";
		b2.isbn = "35355";
		m.isbn = "35535";
		b1.title = "Java Pro";
		b2.title = "�м�����";
		m.title = "Java World";
		b1.author = "���ϳ�";
		b2.author = "�ҳ���";
		m.author = "������";
		b1.publisher = "Jaen.kr";
		b2.publisher = "Jaen.kr";
		m.publisher = "java.com";
		b1.price = 15000;
		b2.price = 30000;
		m.price = 7000;
		b1.desc = "Java �⺻ ����";
		b2.desc = "SW �𵨸�";
		m.desc = "ù����";
		m.year = 2018;
		m.month = 2;
		
		System.out.println("******************************���� ��� ******************************");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(m.toString());
	}

}
