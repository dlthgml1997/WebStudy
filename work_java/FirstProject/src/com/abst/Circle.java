package com.abst;

public class Circle extends Shape {
	int r; //Ŭ���� ���� �ʵ�� �⺻��.
	
	public Circle(int r) {
		this.r = r;
	}

	@Override
	double getArea() { //������
		return Math.PI *r*r;
	}

	@Override
	double getCircum() { //���ѷ�
		return 2* Math.PI *r;
	}
	
}
