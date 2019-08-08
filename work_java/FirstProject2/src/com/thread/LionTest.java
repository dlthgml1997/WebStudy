package com.thread;
//2. Runnable�� implements �ϴ� ��� -> ������ Thread��ü�� �����ϸ鼭 Runnable��ü�� ���ڷ� ������ �־����
class Lion implements Runnable { //Lion�� RunnableŸ���̴�~ �굵 �θ��ڽ� ����
	@Override //�������̽��̹Ƿ� �������̵����־����
	public void run() {
		String name = Thread.currentThread().getName();
		Thread t = Thread.currentThread(); //���� �������� thread�� �˾Ƴ�
											//����ƽ�޼��� �̹Ƿ� Ŭ�����̸�Thread.�޼���();
		System.out.println(t.getName()+" = "+name+" is running... Lion"); //Thread.currentThread().getName()�� ����
																		//���ʺ� �������̽��� ���� �޼��� �̹Ƿ� �׳� �� �� ����
	}
}

public class LionTest {

	public static void main(String[] args) {
		Lion l1 = new Lion(); //l1�� "thread�� �ƴ�. Runnable ��ü��"(=Runnable�� ������ ��ü)!!
								//������ thread�� ���� �۵��� �ϴ��� ǥ���� run() �޼���� ������ ����!!
		Thread t1 = new Thread(l1); //�������� �Ķ���ͷ� Runnable��ü�� Runnable target���� �־��ش�!! 
									//�־��� ��ü�� run()�� ã�� ����
									//"Lion l1�� run()�� ã�� ����"�ϰ� ��
		t1.start();
		
		Lion l2 = new Lion(); 
		Thread t2 = new Thread(l2); //"Lion l2�� run()�� ã�� ����"�ϰ� ��
		t2.start();
		
		Thread t3 = new Thread(new Tiger()); //Tiger�� run()�� ã�� �����ϰ� �� //Tiger�� Runnable(��ü)�̱⵵ �ϴ�.
		t3.start();
		
		Thread t4 = new Thread(l1); //"Lion l1�� run()�� ã�� ����"�ϰ� ��
		t4.start();
		
		//////////////Anonymous Class
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("���� ���� Ŭ����...");
			}
		}).start(); //������ t5�� �����������̽����ְ� �ٷ� start��Ŵ.
		/////////////
	}

}
