package com.object;

public class OverloadingTest {
	int num;
	
	public OverloadingTest(int num) { //������
		super();
		this.num = num; //t.num = 100; ���� �� �� ���� t�� ���θ޼��� �ȿ��� ����Ȱ��̱� ����~ -> this�� ���
	}
	
	//�޼��� overloading : �� Ŭ���� �ȿ��� �޼ҵ� �̸��� ���� �ϰ� "�Ķ���� ����Ʈ"(Ÿ�� ��)�� �ٸ� ��
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) { //���� �޼���
		OverloadingTest t = new OverloadingTest(100);
		System.out.println(t.add(11, 12));
		System.out.println(t.add(11.5, 12.9));

	}

}
