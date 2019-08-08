package com.thread;
//1. Thread Ŭ������ ��ӹ޾� thread ����
class Tiger extends Thread { //Tiger�� Thread��ü�̴�~ ���� Runnable(��ü)�̱⵵ �ϴ�.
	//run()�� "callback �޼ҵ�" : 
	//���� ȣ������� ������ Ư�� ����(start()ȣ��Ǵ� ��)�� �Ǹ� �ڵ�ȣ��(�ڵ�����)�Ǵ� �޼ҵ�
	public void run() { //thread�� �ؾ��� �۾� ������ ������ �ִ� �޼��� run()
		System.out.println(getName()+" is running... Tiger"); //ThreadŬ�������� "�������� ������ �̸��� ������ִ� �޼��� getName()"
	}
}

public class TigerTest {
	public static void go() {
		System.out.println("gogogo");
	}
	
	public static void main(String[] args) { //main�����尡 ����
		go(); //main�����尡 �����ϴ� ����ƽ �޼���
		Tiger t1 = new Tiger(); //t1�� ������ �������̴�~
		t1.start(); //thread �۾� ������ �˸��� �޼ҵ� start() //t1�� TigerŬ������ run()�޼��带 ã��������!!
		Tiger t2 = new Tiger();
		t2.start();
		Tiger t3 = new Tiger();
		t3.start(); //t3�����尡 Tiger�� run()�� �����Ϸ� �� - "run()�� ���������� ȣ��" - run�� callback�޼ҵ�
		t3.run(); //main�����尡 Tiger�� run()�� "���� ȣ���ؼ� ����"
		
	}//�����غ��� ������ ������ �� ����(�ڹٿ����� thread ���� �������� �ʴ´�)

}
