package com.object;

public class Circle {
	//field
	int radius;
	
	//������("�ϳ��� �ȸ������� ���" , Circle(){}���� �ƹ��͵� ���� default�����ڰ� �ڵ����� �߰���!)
	
	public Circle(int radius){
		this.radius = radius; //Ŭ�����ʵ� = �Ķ����
	}
	
	//method
	double getArea() {
		return 3.14*radius*radius;
	}
	double getCircum() {
		return 3.14*2*radius;
	}
	public static void main(String[] args) { //�����Լ����� ��ü���� �� ���
//		Circle c = new Circle(); 
//		c.radius = 3;
		Circle c = new Circle(3); //����Ʈ�� �ƴ� ���� ���� �����ڸ� ����ؾ� �Ѵ�.
		
		System.out.println(c.getArea());
		System.out.println(c.getCircum());

	}
}
