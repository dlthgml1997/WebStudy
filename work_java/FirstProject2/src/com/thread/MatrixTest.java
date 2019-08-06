package com.thread;

class Matrix extends Thread {
	int num; //thread�� ���� �������� ��

	public Matrix(int num) {
		this.num = num;
	}
	
	public void run() { //thread �۾� ���� -> �ڱⰡ ���� �� ���
		for(int i=1; i<=9; i++)
			System.out.print(num + "*"+ i + "=" + (num*i)+"\t");
		System.out.println();
	}
}


public class MatrixTest {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			Matrix m = new Matrix(i);
			m.start();
			try {
				m.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
