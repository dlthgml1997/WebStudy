package com.thread;
//Synchronization(����ȭ) : ��Ƽ�����忡 ���� �����Ǵ� �ڿ��� lock�� �Ŵ� �۾�
public class SyncTest implements Runnable {

	public static void main(String[] args) {
		new SyncTest().go();  // �����ڰ� ȣ��
	}

	private void go() { //thread ���� �� start
		Thread tom = new Thread(this, "tom");//���ʺ�Ÿ��, �̸�(threadŬ������ .getName()���� �������� �̸�)
		Thread jerry = new Thread(this, "jerry");//���ʺ�Ÿ��, �̸�
		tom.start();
		jerry.start();
	}

	@Override
	public void run() {
		kitchen();
		bedroom();
	}

	private synchronized void bedroom() { //���� �� �޼ҵ忡 ���� �ٸ� ������� �����ٴ� ���ľ� synchronized
		String name = Thread.currentThread().getName(); //Thread.currentThread(); ���� �� ���� �������� �����带 ����!!
		System.out.println(name+ " is in bedroom");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+ " is out bedroom");
	}

	private synchronized void kitchen() {
		String name = Thread.currentThread().getName();
		System.out.println(name+ " is in kitchen");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+ " is out kitchen");
	}
	
/*	tom is in kitchen
	tom is out kitchen
	jerry is in kitchen
	jerry is out kitchen
	jerry is in bedroom
	jerry is out bedroom
	tom is in bedroom
	tom is out bedroom 
	�Ǵ�
	jerry is in kitchen
	jerry is out kitchen
	jerry is in bedroom
	jerry is out bedroom
	tom is in kitchen
	tom is out kitchen
	tom is in bedroom
	tom is out bedroom
	�� tom�� jerry�� ������ ���� �� ����. �׷��� �� ������� run()������� kitchen -> bedroom �湮
	*/
}
