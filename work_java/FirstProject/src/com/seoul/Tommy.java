package com.seoul;

public class Tommy {
	public int age = 30;
	
	public void hello() {
		Member m = new Member();
		//m.num = 999;�� �ȵʤ̤� �ʵ尡 private�̶�.. 
		m.setNum(999); //�޼ҵ带 ���ؼ� ���������� �����Ϳ� ������ ����
 		System.out.println("hello, tommy...");
	}
}
