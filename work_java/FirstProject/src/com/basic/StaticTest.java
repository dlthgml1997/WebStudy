package com.basic;
//static class Sclass{} //(StaticTest�� ������ ����)top-level class�� ���� static ��� �ȵ�!!! error
public class StaticTest { //top-level class
	
	static class Sclass{} //inner class.���� Ŭ������ static�� �����ϴ�!!!
	
	static int scount; //0
	int count; //0
	
	static void hello() {
		System.out.println("static method...+ scount"); //+count�� ���Ұ�. ��ü�������� �ʾұ� ����
	} //��ο��� Ŭ�������� �ҷ����Ҵ�.

	void hello2() {
		//static int num = 7; ////���������� static�ȵ�!//count�� �����ɶ��� ��ü�� �����Ǿ��� ���ε� �� ������ ����ƽ�� ����? �ȵ�
		System.out.println("static method...+ scount"); 
		System.out.println("non-static method...+ count"); //count�� �����ɶ��� ��ü�� �����Ǿ� hello2�޼��嵵 �̹� �����Ǿ��� ���̱� ������ ����
	} //��ο��� Ŭ�������� �ҷ����Ҵ�.

	
	static { //static Block
		System.out.println("static block -1");
	}
	
	public static void main(String[] args) { //static method ���ο����� this, super Ű���� ��� ����!!
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
