package com.io;

import java.io.Serializable;

//�ſ�ī�� ���� ������ ���� Ŭ����. vo(value object) : � ���� �����ϱ� ���� �뵵�� Ŭ���� - � �۾��� ���� ����
//											private �ʵ�, ������, ����/���� �� ����
//"��Ʈ���� ���ؼ� ��ü�� �̵�"��Ű�� ���ؼ��� "Serialization(����ȭ)"�� �Ǿ��־�� �Ѵ�.
//	Ŭ���� ���� �����͵��� ����Ʈ �迭 �������� ������ �׷��� �Ǵ� ��
public class Card implements Serializable { //implements Serializable���̸� ����ȭ �ȴ�. �߻�޼�������Ƿ� �ۼ��� �ʿ�X
	private int num;
	private String name;
	private String company;
	
	public Card(int num, String name, String company) {
		this.num = num;
		this.name = name;
		this.company = company;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
