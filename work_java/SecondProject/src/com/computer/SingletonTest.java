package com.computer;

public class SingletonTest { //��ü1���� �������� ���� ���

	public static void main(String[] args) {
		//SingletonObject s = new SingletonObject(); �����ڰ� private���� �����ִ�. ��� ����� ����ƽ �޼��带 ���
		
		//<����ƽ �޼���>�� "��ü���� ���ϰ�" "Ŭ�����̸����� ȣ��"!!!!
		SingletonObject s1 = SingletonObject.getInstance();
		SingletonObject s2 = SingletonObject.getInstance();
		SingletonObject s3 = SingletonObject.getInstance();
		SingletonObject s4 = SingletonObject.getInstance();
		s1.test();
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4); //���� ������ �ϳ��� ��ü( "�ּҰ� ���ߴµ� ����"�����Ƿ� )
	}

}
