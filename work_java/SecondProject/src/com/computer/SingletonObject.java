package com.computer;

public class SingletonObject {
	//1. field�� ���� : <static, private> ���ѹ��� ����� �ܺο��� ����X
	private static SingletonObject instance; //SingletonObject(��ü, ����)Ÿ���� instance������ ����ƽ�̹Ƿ� C.A.���� ���� ��ü���� ������!!!!
	//��ü�� ����ƽ�� ���ϰ��, ��ü�� ������ ������ �ʰ� �ϳ��� ���� �����ؼ� ���
	
	//2. ������ : private (Ŭ�����ܺο��� �������ϰ� ���Ƴ���)
	private SingletonObject() {}//�����ڸ޼��尡 private�� �������� >Ŭ���������� �Ʒ��ʿ����� ���
	
	//3. ��ü�� �����ؼ� ������ �ִ� static �޼ҵ尡 �־����
	public static SingletonObject getInstance() { //C.A�� �ѹ������ǰ� �ٽþȸ������
		if (instance == null) {//����
			instance = new SingletonObject(); 
		}
		return instance;
	}//�޼��带 �ݺ��ؼ� ȣ���ص� "instance ��ü�� ��������� ���� �� ó���� �� �Ѱ���", �� �Ŀ��� ��� �� ��ü�� ����
	
	public void test() {
		System.out.println("hello");
	}
}
