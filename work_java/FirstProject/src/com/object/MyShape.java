package com.object;

import com.abst.Shape; //.*���� ��Ű������ ��� Ŭ���� ����Ʈ
import com.abst.Circle; 
import com.abst.Rect; 


public class MyShape<X extends Shape> { //������ Ÿ�Կ� ���������� �ɾ ������ ���� ���̴� ���
	X data;
	
	public static void main(String[] args) {
		MyShape<Circle> m = new MyShape<>();
		MyShape<Rect> m2 = new MyShape<>();
		//MyShape<String> m3 = new MyShape<>();
		
	}

}
