package com.basic;

public class StaticTest {
	
	static int scount; //0
	int count; //0
	
	static void hello() {
		System.out.println("static method...");
	} //��ο��� Ŭ�������� �ҷ����Ҵ�.
	
	static { //static Block
		System.out.println("static block -1");
	}
	
	public static void main(String[] args) {
		System.out.println(StaticTest.scount); //"��ü ���� ����" "Ŭ���� �̸����� ���"!!!!
		
/*		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();
		StaticTest s3 = new StaticTest(); //�����ϴ� ��ü���� count�� ���� ����������, scount�� ��� C.A.�� ���� ������ �����Ѵ�.
		
		System.out.println(++s1.count + "--" + ++s2.count + "--" + ++s3.count);
		System.out.println(++s1.scount + "--" + ++s2.scount + "--" + ++s3.scount);*/

	}
	static { //static Block : main���� ���� ����ȴ�.
		System.out.println("static block -2");
	}
}
