package com.basic;

public class ArrayTest_ {

	public static void main(String[] args) {
		//int[] a; //����
		//a = new int[3]; //����
		int[] a = new int[3]; //����+����
		//int[] a2 = {100, 200, 300}; // ����+����+�ʱ�ȭ
		a[0] = 100; //���
		a[1] = 200;
		a[2] = 300;
		
		//�迭���� �� ó��
//		for(int i = 0; i < a.length; i++) { //a.length�� a�迭�� ��ĭ(3)¥������ �̴�~~~
//			System.out.println(a[i]);
//		}
		for(int x : a) { //inhanced for
			System.out.println(x);
		}
		
		
		boolean[] flag = {true, false, false}; //�迭�� ����, �ʱ�ȭ�� �ѹ���
		for(boolean value: flag) { //inhanced for�� : flag�迭 ���� ���� �ϳ��� value����(booleanŸ��)�� ����
			System.out.println(value);
		}

	}

}
