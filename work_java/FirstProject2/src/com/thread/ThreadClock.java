package com.thread;

import java.util.Date;

public class ThreadClock implements Runnable {
	public ThreadClock() { //thread ���� �� start
		Thread t = new Thread(this); //�ڱ� �ڽ��� run()�޼ҵ带 ������ ���� 
										//this, �� ThreadClock�� run()�� ����
		t.start();
		
	}
	public static void main(String[] args) {
		new ThreadClock(); //��ü�� ������ �ϰ� �� �̸����� �� �Ұ� ���� �� �̷��� �ۼ�
	}
	
	
	//thread�� �ؾ� �� ������ ���� �޼ҵ�:1�� �������� ȭ�鿡 �ð��� ���
	@Override
	public void run() {
		while(true) { //���ѷ���. �׷��� �ð��� 1�ʰ���
			Date d = new Date(); //��ü ���� �ÿ� �ý��ۿ��� ��¥(+�ð�)������ �޾ƿ�.
			System.out.println(d);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
