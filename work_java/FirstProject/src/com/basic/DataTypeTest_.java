package com.basic;

public class DataTypeTest_ {

	public static void main(String[] args) {
		//������ : ��, ���� 
		boolean flag = true; //�캯�� ���� ���ͷ�(���ڴ� �ȵ� ~~)
		
		//������ -->int.
		byte b = 1; //1 : -128 ~ 127
		
		//b = b + 1; 
		//���� ���ͷ��� "���꿡 ���� ����"(���� ���Կ��� ���������!), JVM���� ���� ���ͷ��� 4Byte"�� ������ ���ִ�.
		//byte������ b�� �������ͷ� 1�� ���� --> �������� �� ū 4Byte�� ���´�. 
		//�������� int�� byte�� �����ϸ� Ÿ���� �ȸ¾Ƽ� ����(������ �ս� ���ɼ�)
		//			-->1) ������ Ÿ�Ժ�ȯ �Ǵ� 2) b�� Ÿ���� �ٲ㼭 �����ֱ�
		b = (byte)(b + 1); //1) ������ ����ȯ=explicit type casting - ū Ÿ���� �����͸� ���� Ÿ���� �����Ϳ� ���� ��
		//			-->�׳� ������ ������ "int"�� ����ϸ� ����ȯ �ʿ�X
		
		short s = 300; //2
		s = b; //���� �����͸� ū�� ���°� �������� = implicit type casting
		
		int i = 12345; //4
		s = (short)i;
		
		long l = 67890; //8
		char c = 'q'; //2 : ���� 1���� �����ϱ� ���� Ÿ�� -- '����1��' �Ǵ� ����
		char c2 = '\t'; //tabŰ, \n:newline(�ٹٲ�)
		
		//�Ǽ��� -->double
		//float f =2.1; �Ǽ��� ���ͷ��� ������(���Ը� �Ҷ���)"8Byte"�� ����Ǿ� ����. �׷��� ������ Ÿ���� �ȸ¾Ƽ� ���� �Ұ�~
		float f = 2.1f;
		double d =3.14;
		
		System.out.println("hello" + c2 + "bye");
		System.out.println(flag);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);//��Ʈ��+��Ʈ+�Ʒ�����Ű�� �ڵ�����

	}

}