package com.exception;
//Arithmetic Exception : Runtime Exception
//NullPointerException : ��ü ������ ���� �ʰ� ����Ϸ� �� �� �߻� - ���� ����
class Car{
	void go() {
		System.out.println("gogo~~~~~");
	}
}

public class ArithMeticTest {
	
	public static void main(String[] args) {
		int a = 90, b = 0, c = 0; //try-catch�������� ����ϹǷ� ���⼭ ����
		
		try { //Ʈ���̸� ������ ���� �ʰ� ���� �ȿ� ����, �ͼ��� ������ �������� catch�� ������...
			Car cc =null;
			cc.go();
			
			/////
			c = a / b;
/*		}catch(ArithmeticException e) { 
			c=-999;
		}catch(NullPointerException n) {
			System.out.println("��ü�� �������ּ���");
		}*/			
		}catch(Exception q) { //q�� �Ƹ�����ƽ, �������͵� ��� ����(���� ��ü) catch���� ���� �� ����
			q.printStackTrace(); //����ó���� ������ ���������� ������ ��µǹǷ�
		}
		
		System.out.println(c);
		
		

		
	}
}
