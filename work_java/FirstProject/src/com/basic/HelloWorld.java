package com.basic;

public class HelloWorld { //Ŭ�������ľ� class(=��ǰ) Ŭ�����̸�
	/*"main"�޼ҵ�(=�Լ�) : Ŭ������ "����"�� ���ؼ� �� �ʿ��� �κ��̴�. 
	������ �Ǵ� Ŭ������ ������ �ȵǴ� Ŭ������ ����� ������ ���⵵ ��.*/
	public static void main(String[] args) { //���� �޼ҵ�� �� ������ �������
		System.out.println(StaticTest.scount);
		StaticTest.hello();
		System.out.println(Math.pow(2, 3));
		
		String name = "tommy"; //����
		System.out.print("hello,"+ name); //"�����(�ܼ�)"�� ����ϴ� ���� -->"ǥ�����" (ǥ���Է��� Ű����)
		//System.out.println(); //sysout + <����Ʈ��+�����̽�>����Ű
		System.out.println(123); //�ٹٲ�(ln)
	}

}