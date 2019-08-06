package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//InterruptedException : Checked Exception(üũ�� �Ǿ�� �ϴ� ����) try~catch�� ó���ؾ� ��
public class ThreadTest {

	public static void main(String[] args) {
		//Thread t = new Thread(); //�ʿ����
		
		try {
			//t.sleep(3000);//���α׷� ������ �־��� �ð�(ms)���� ���ߴ� �޼ҵ�
			Thread.sleep(3000); //sleep�� ����ƽ�޼ҵ�!�ΰ��� ���� "��ü�������� Ŭ�����̸�.�޼����̸�();"���� �ٲ��־���.
		} catch (InterruptedException e) { //sleep���߿� ���ͷ�Ʈ�� �߻��ϴ� �ͼ���
			e.printStackTrace();
		} 
		System.out.println("hello, world...");
		
		///
		
		try {
			FileInputStream fis = new FileInputStream("HELLO.txt");//���Ͽ��� ������ �о���� ������
		} catch (FileNotFoundException e1) { //�� ������ ������ ��ϴ���
			System.out.println(111);
			e1.printStackTrace(); //����ó���� �� �Ǿ �ͼ��� ������ ������ ���
		} 
																
		
		
	}

}
