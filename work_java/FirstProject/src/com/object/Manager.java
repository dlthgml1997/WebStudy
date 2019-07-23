package com.object;

class Employee {//���
	int num;
	String name;
	int salary;
	
	public Employee(int num, String name, int salary) {
		super();
		this.num = num;
		this.name = name;
		this.salary = salary;
	}

	double getBonus() {
		return salary * 0.2;
	}
}

public class Manager extends Employee {//����
	int deptcode; 
	
	public Manager(int num, String name, int salary, int deptcode) {
		super(num, name, salary); //"super()�޼ҵ� : �θ� ������ ȣ��~" �θ�� �ߺ��Ǵ� �ڵ� ������
/*		this.num = num;
		this.name = name;
		this.salary = salary; �̷��� �ߺ��Ǹ� �����߻�*/ 
		this.deptcode = deptcode; 
	}
	
	//
	double getBonus() { //�������̵�
		return salary * 0.3;
	}	
	
	


	public static void main(String[] args) {
		Employee tom = new Employee(100, "tom lee", 5000);
		Employee tom2 = new Manager(100, "tom lee", 5000, 1);
		Manager bill = new Manager(200, "bill jones", 7000, 1);
		
		System.out.println(tom.getBonus());
		System.out.println(tom2.getBonus());
		System.out.println(bill.getBonus());

	}

}
