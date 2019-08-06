package com.inner;
//static class ���� : static class ��� �ÿ��� �ݵ�� �ٱ��� Ŭ������ �������� �ʾƵ� ��!
//�ٱ��� Ŭ������ �̸����� ���� ����
class Outer{ //top-level class
	static int count = 99;
	
	static class Inner{ //static inner class 
		public void go() {
			System.out.println(count); //�ٱ� Ŭ������ ����ƽ �ʵ带 ���
		}
	}
}

public class StaticClassTest {

	public static void main(String[] args) {
		System.out.println(Outer.count); //����ƽ �����̹Ƿ� Ŭ�����̸�.�����̸����� ���ٰ���
		
		//inner class ����(�׳� Inner��� �ϸ� ���˾Ƶ���.)
		//���� count�� �Ȱ���, ����ƽ�� ���� class�̹Ƿ� (�ܺ�)Ŭ�����̸�.Ŭ�����̸����� �����ؼ� ������ �� �ִ�.
		Outer.Inner i = new Outer.Inner(); //OuterŬ������ ���������� �ʾ���!!
		i.go();
		System.out.println(i.getClass().getName()); //com.inner.Outer$Inner, �� Outer$InnerŬ�����̴�.

	}

}
