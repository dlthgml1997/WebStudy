package com.seoul;

public class Member {
	//field 
	private int num;
	private String name;
	private String address;
	
	//method : getter & setter
/*	public void setNum(int num) { //����
		this.num = num;
	}
	public int getNum() { //����
		return num;
	}*/
	//source���� ������ ����
	public int getNum() {
	//	if(����üũ) ����Ǹ� ���� �Ѱ���
		return num;
	}
	public void setNum(int num) {
		if(num>0) //����� ���� �־��� ��, �޼ҵ带 ���ؼ��� �����Ϳ� ���� �����ϵ��� �Ѵ�.
			this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
