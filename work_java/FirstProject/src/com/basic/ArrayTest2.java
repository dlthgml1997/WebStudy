package com.basic;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] a = new int[3]; //����+����
		boolean[] b = new boolean[100];
		double[] d = new double[200];
		String[] name = new String[10];
		
		//�������� new�� ������ �� �⺻���� default���� ����.
		//���� �������� �迭�� ������ �ص� Ÿ�Ժ��� default���� �� �ִ�.
		System.out.println(a[1]); //0
		System.out.println(b[56]); //false
		System.out.println(d[195]); //0.0
		System.out.println(name[7]); //null
	}

}
