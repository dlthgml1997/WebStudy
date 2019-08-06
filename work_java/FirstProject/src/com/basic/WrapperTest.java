package com.basic;

public class WrapperTest {
	
	public void test(Integer x) {
		System.out.println(x+1); //Integer - > int ��ڽ��� ���Ե� ���� 
	}
	
	public static void main(String[] args) {
		new WrapperTest().test(55); //boxing int -> Integer //Integer���� ��� �ϴµ� int���� �����. but �����Ϸ� ���ο��� �ڵ����� boxing����.
		
		int a = 89;
		double d = 3.66;
		boolean flag = true;
		char c = 'x';
		String num ="345";
		
		//�⺻�� �����͸� ��ü������ ��ȯ���� �ִ� Ŭ���� -> wrapper class(boxing) (�޼ҵ带 ȣ�� �� �� �ְԵ�)
		Integer i = new Integer(a);
		int num2 = Integer.parseInt(num);
		double d33 = Double.parseDouble("5.66");
		
		Double d2 = new Double(d);
		Boolean b2 = new Boolean(flag);
		Character c2 = new Character(c);
		
		int val = i.intValue(); //unboxing
		double d3 =d2.doubleValue();
	}

}
