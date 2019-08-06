package com.util;

import java.util.ArrayList;

import com.object.Circle;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>(); //����� ���׸� ���α׷����� ���� ��. �Ѹ���Ʈ��  Ÿ���� ��ġ��Ŵ
		name.add("tommy");
		name.add("jane");
		name.add("billy");
		name.add("tommy");
		name.add("harry");
		
		System.out.println(name.get(2));
		name.remove("tommy"); //ù��° ��̰� �����
		
		System.out.println(name); //���۷����� ������ .toString()ȣ�� �������̵� �Ǿ��ִ�
		for(String n:name)
			System.out.println(n);
		
		ArrayList<Circle> list = new ArrayList<>(); //�������� Ŭ������ �����´�
		list.add(new Circle(6));
		list.add(new Circle(7));
		list.add(new Circle(8));
		list.add(new Circle(9));//���������� �־����� ������ �Ǿ��ٴ� ���� �ȴ�.(�����ڿ��� public�� �پ�����)
		
		for (Circle circle : list) {
			System.out.println("---------------");
			System.out.println(circle.getArea());
			System.out.println(circle.getCircum());
		}
	}

}
