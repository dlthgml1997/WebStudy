package com.basic;

public class MethodTest_ {
	//main�޼���ٱ��� �ٸ� �޼������ "����"
	//add(): int�� ���� 2���� �Է¹޾� �� ���� �������ִ� �޼���
	static int add(int a, int b) { 
		int c = a + b;
		return c;
	}
	//increase(): int�� ���� 1���� �Է� �޾� 10�� ���� �� ����� �ִ� �޼ҵ�(������ ������ ����)
	static void increase(int x) {
		System.out.println(x + 10);
	}
	public static void main(String[] args) { //public static�� �޼����� ���ľ�
		// main�޼��� ���ο��� ����� ���� �޼ҵ���� ����ϴ� �κ�
		int result = add(3, 8);
		System.out.println(result);
		//System.out.println(add(3, 8));�ص� ��
		increase(55);
	}
	//main�ٱ�
	
}
