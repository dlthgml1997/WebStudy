package com.abst;

public class ShapeUser {

	public static void main(String[] args) {
		Shape[] s = new Shape[3]; // 
		//Shape a = new Shape(); //Shape Ÿ���� ������ �ȵ�..
		s[0] = new Circle(8);
		s[1] = new Rect(8, 12);
		s[2] = new Circle(13); //s�� "�θ�Ÿ���� shape�� �迭"�̹Ƿ�, "������ �ڽ� Ÿ�Ե�"�� ��� "����"�� �� �ȴ�!
		
		for(Shape x :s) {
			System.out.println(x.getClass().getSimpleName()); //Ŭ�����̸���.
			System.out.println("����:"+ x.getArea());
			System.out.println("�ѷ�:"+ x.getCircum());
			System.out.println("---------------------------");
		}
		
	}

}
