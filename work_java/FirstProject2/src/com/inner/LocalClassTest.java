package com.inner;
//local class ���� : �޼ҵ� �ȿ��� ����ǰ� �޼ҵ� �ȿ����� ���Ǵ� Ŭ����
class Mountain{ //top-level class
	int height = 1950;
	public void dig() {
		class Gold{ //local inner class : �޼ҵ� �ȿ� Ŭ������ ������
					//�� �޼ҵ� �ȿ����� ��밡���� Ŭ����(��Ȱ�뼺�� ����.)
			void glitter() {
				System.out.println("height:" + height);
			}
		}
		//GoldŬ���� ��, dig()�޼ҵ� ��
		Gold g = new Gold();
		g.glitter();
		System.out.println(g.getClass().getName()); //com.inner.Mountain$1Gold ���ڰ� ������
	}
}

public class LocalClassTest {

	public static void main(String[] args) {
		new Mountain().dig();

	}

}
