package com.pusan;
import java.awt.Button;
//import java.awt.*; //�� ��Ű������ ��� Ŭ������ CA�� �÷��� �޸𸮰� ����� �� ����
import java.util.Date;

import com.object.Circle;
import com.seoul.Tommy; //�۾������� ��Ű�� �̹Ƿ�, �ٸ� ��Ű���� Ŭ������ ����Ϸ��� import ��Ű��.Ŭ������ ���־����
//Organize imports(��+��+o)�� ������ import�� ���� �� �ִ�.

public class Bill {
	public static void main(String[] args) {
		Button b = new Button();
		Date d = new Date();
		System.out.println(d); //d.toString()�� ����
		Tommy t = new Tommy();
		t.hello();
		System.out.println(t.age); //�ʵ�age, �޼��� hello�� �տ� �ۺ� ���ľ �پ�� �ٸ���Ű������ ������ �� ����!!!
		
		Circle c = new Circle(8); 
	}
}
