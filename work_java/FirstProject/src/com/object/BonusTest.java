package com.object;

public class BonusTest { 
		void sayBonus(Employee who) { //��ǲ���� ������ �ƴ� ���÷��� Ÿ�� "��ü"�� ����.
			System.out.println(who.getClass().getName()); //Ŭ������ �̸�(��Ű��.Ŭ����)
			System.out.println(who.getBonus());
			System.out.println("-------------------");
		}
		
		void sayBonus(Manager who) { //��ǲ���� ������ �ƴ� ���÷��� Ÿ�� "��ü"�� ����.
			System.out.println(who.getClass().getName()); //Ŭ������ �̸�(��Ű��.Ŭ����)
			System.out.println(who.getBonus());
			System.out.println("-------------------");
		} //�Ȱ��� �Լ��� �� �ۼ��� overloading(������Ȱ���ϸ� �ʿ�X)
		
	public static void main(String[] args) {
		BonusTest bt = new BonusTest();
		Employee tom = new Employee(111, "tom brown", 3000);
		Manager bill = new Manager(789, "bill jones", 5000, 100);
		bt.sayBonus(tom);
		bt.sayBonus(bill); //ũ����غ��� ���÷��̿� �� ���ִ�. Employee who = bill;
		////"Ÿ���� ���÷��� ������ �Ŵ����� ����", "�Ŵ������� overriding"�� �Ǿ����� ������ �������̵��� getBonus()�� ȣ��ȴ�!!!!!!!!!!<������>

	}

}
