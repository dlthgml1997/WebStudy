package com.object;

public class CarTest {
	public static void main(String[] args) { 
		Car c1 = new Car(); //Ŭ���� �̿��ؼ� ��ü ����
		Car c2 = new Car(7833);
		Car c3 = new Car(8907, "morning") ;
		Car c4 = new Car(6899, "grandeur", "tommy"); //��ü�� �����ϰ�, �Ķ���Ͱ� �ִ� �Ʒ����� �����ڰ� �����!!!

		//��ü ���
//		c1.model = "K5";
//		c1.owner = "kim";
//		c1.num = 1234;
		
		c1.info(); 
		c2.info();
		c3.info();
		c4.info();
		
	}
}
