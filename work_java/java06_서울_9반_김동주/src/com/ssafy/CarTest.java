package com.ssafy;

//import java.util.Arrays;

public class CarTest {
	//CarMgr�� �׽�Ʈ �Ѵ�.
	
	///�ʿ信 ���ؼ� �߰��� �޼���
	public static void ToString(Car c) {
		System.out.println(c.toString());
	}
	public static void ToString(Car[] c) {
		for(Car x :c) {
			if(x!=null)
				System.out.println(x.toString());
		}
	}
		
	public static void main(String[] args) {
		CarMgr c = CarMgr.getInstance(); //
		
		Car c1 = new Bus("1��","1��",1,1);
		Car c2 = new Truck("2��","2��",2,2);
		Car c3 = new Bus("3��","3��",3,3);
		Car c4 = new Truck("4��","4��",4,4);
		Car c5 = new Bus("5��","5��",5,5);
		Car c6 = new Truck("6��","6��",6,6);
		Car c7 = new Bus("7��","7��",7,7);
		Car c8 = new Truck("8��","8��",8,8);
		Car c9 = new Bus("9��","9��",9,9);
		
		c9.toString();
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		c.add(c7);
		c.add(c8);
		c.add(c9);
		System.out.println(c.size());
		System.out.println(c.totalPrice());
		c.update("4��", 111);
		c.delete("6��");
		ToString(c.search());
		ToString(c.search("4��"));
		//if (c.search("6��") == null)
		//	System.out.println("�������");
		ToString(c.search(7));
		
		System.out.println(c.size());
		System.out.println(c.totalPrice());
		

		
	}

}
