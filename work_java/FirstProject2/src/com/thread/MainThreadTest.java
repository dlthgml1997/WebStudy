package com.thread;

public class MainThreadTest implements Runnable {

	@Override
	public void run() { //thread�� �۾� ������ ��� �ִ� �޼ҵ�
		System.out.print("run by thread...");
		Thread tt = Thread.currentThread();
		System.out.println(tt.getName()+" is running...");
	}
	
	public void go() { 
		System.out.println("method go...run by main");
	}
	
	public MainThreadTest() { //����Ʈ ������. Thread �����Ŀ� start 2.
		Thread t = new Thread(this, "tommy"); //Runnable��ü�� m�� ����Ŵ.
		t.start();
		try {
			t.join(); //������t�� �۾��� ��ġ�� ���� ������ �ٸ� ������ ex)main������ �� �� ��ٷ� �޶� 
		} catch (InterruptedException e) { //(����������)
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MainThreadTest m = new MainThreadTest(); //1.
		m.go(); //3.������!!���� �����尡 �����ϹǷ� �����ھ��� t.start()-����� ���� �����庸�� �켱������ ����!!
	}
}
