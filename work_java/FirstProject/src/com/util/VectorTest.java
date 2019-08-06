package com.util;

import java.util.Vector;
//Vector(List����) : �������� ���� O, �ߺ� O
public class VectorTest {

	public static void main(String[] args) {

		
		Vector v1 = new Vector(2); //������(�ʱ�capacity, ���� capacity); ��ĭ�� �ø��� �����ϸ� ���ڶ��� ��� "2��" �ø���.
		System.out.println(v1.capacity()); //capacity():���� ��ü ũ�� = ���Ͱ� �迭�� ��ĭ���� (����Ʈ 10ĭ�̹Ƿ� 4ĭ�� ��������)
											//������ �Ѿ�� ���ο� �迭�� ���� ���� �ٿ��ֱ� �Ѵ�.
		v1.add("hello");
		v1.add(123);
		v1.add(3.67);
		System.out.println(v1.capacity());
		v1.add('x');
		v1.add(true);
		System.out.println(v1.capacity());
		v1.add("hello");
		
		for(int i=0; i < v1.size() ; i++) { //size():������ ���빰(������)���� 
			System.out.println(v1.get(i)); //���Ϳ��� ���Ҳ�����
		}
		v1.remove(1); //index 1�� �����͸� ����
		System.out.println("---------------------------");
		for(int i=0; i < v1.size() ; i++) { 
			System.out.println(v1.get(i)); 
		}
		v1.clear(); //��� ������ ����
		System.out.println(v1.isEmpty()); //true
		System.out.println(v1.size()); //0 
		/////////////////
		Vector<String> v2 = new Vector<>(); //<����>�� generic���α׷��� ��� ������ �� : ����� Ÿ���� ������ <��>���� ���� ���� 
		v2.add("red");
		v2.add("blue");
		v2.add("white");
		v2.add("pink");
		v2.add("red");
		//v2.add(123);
		
		for(String color : v2) { //Ÿ���� ��ġ�ǹǷ� for each���� ����Ҽ� �ִ�. 
			System.out.println(color);
		}
		////////////////
		int a = 3, b = 5;
		Vector<Integer> v3 = new Vector<>(); //"�ݷ��� ���� Ŭ����" �ȿ��� int �� �⺻���ȵǰ� �������� "��ü�� ���尡��"!!!! - Wrapper Ŭ������ Ȱ���ؾ���
		v3.add(new Integer(3)); 
		v3.add(new Integer(a));
		v3.add(new Integer(b));
		v3.add(3); //���� �ȵǴµ� auto-boxing �߻�. �ڵ����� �� ��ȯ�� �Ǿ add ��Ų��.
		v3.remove(0);
		System.out.println(v3.size()); //remove�ϸ� �˾Ƽ� �ε����� �������� size�� �°� �پ��� ���� Ȯ���� ���ִ�.
	}

}
