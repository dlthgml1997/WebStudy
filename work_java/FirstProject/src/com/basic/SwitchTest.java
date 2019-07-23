package com.basic;

public class SwitchTest {

	public static void main(String[] args) {
		char code = 'Y';
		switch (code) {
			case 'X':
			case 'x':
				System.out.println("room-101");
				break;
				
			case 'Y': //�극��ũ�� �����Ƿ� �Ʒ��� ������ �� ����
			case 'y':
				System.out.println("room-201");
				break;
				
			case 'Z':
			case 'z':
				System.out.println("room-301");
				break;
				
			default:
				System.out.println("room-500");
				break;
		}
		
		
		int score = 80;
		switch (score) { //switch + <��Ʈ��+�����̽�>����Ű�� ����
			//(����)�ȿ� byte, short, int, char, String("long�� ������ �������� String��" �� �� �ִ�.)
			case 90:
				System.out.println("level-1");
				break;
			case 80:
				System.out.println("level-2");
				//break; �극��ũ�� ������ case�� �ɸ� �� ������ �ʰ� �Ʒ��� �� ������
			case 70:
				System.out.println("level-3");
				//break;
			default:
				System.out.println("no level");
				//break; �̰ǻ������ ������ ������
		} 

	}

}