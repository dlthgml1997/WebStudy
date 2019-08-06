package com.inner;
//member class ���� : member class ��� �ÿ��� �ݵ�� �ٱ��� Ŭ������ ���� �����Ǿ� �־�� ��!
class Car{ //top-level class
	int speed = 200; //member field
	//member method
	class Engine{ //member inner class (���� ���ľ�� �ٿ�����) - "Ÿ���� Ŭ������ Car�� ���"
					//���� ����ʵ�speedó�� EngineŬ������ CarŬ������ ����̴�.
		public void run() {
			System.out.println("speed:" + speed);
		}
	}
}

public class MemberClassTest {

	public static void main(String[] args) {
		Car c = new Car(); //�ٱ��� Ŭ������ ��ü�� ����
		System.out.println(c.speed);
		
		Car.Engine e = c.new Engine(); //new�Ŀ�, �����Ȱ�ü�� ���۷���.new �̳�Ŭ����
		e.run();
		System.out.println(e.getClass().getName()); //com.inner.Car$Engine //����Ŭ������ Ŭ���������� ���θ������
	}
}
