package com.computer;

public class Parts {
	String maker;
	int price;
	
	public Parts(String maker, int price) {
		this.maker = maker;
		this.price = price;
	}//�θ��� Parts�� ����Ʈ�����ڰ� �����Ƿ� �ڵ����� ��������� �ʰ� �Ķ���͸� �־��־�� �����ȴ�.

	public void info() {
		System.out.println("maker:"+ maker);
		System.out.println("price:"+ price);
	}
}
