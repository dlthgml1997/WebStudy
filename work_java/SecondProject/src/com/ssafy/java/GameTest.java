package com.ssafy.java;

import java.util.Scanner; //Scanner�޼��带 ����ϱ� ���� import

public class GameTest {

	public static void main(String[] args) {
		//int computer = (int)(Math.random() * 3) + 1; //1,2,3�� �������� 1�� ����. int�� �Ҽ��� �Ʒ��� ���ȴ�.
		Scanner s = new Scanner(System.in);
		System.out.println("1. 5�� 3��");
		System.out.println("2. 3�� 2��");
		System.out.println("3. 1�� 1��");
		System.out.println("��ȣ�� �Է��ϼ���. ");
		int num = s.nextInt(); //
		int pan = 7 - 2*num;
		int u_win = 0;
		//System.out.println("���������� �� �ϳ� �Է�: ");
		for(int i=1; i<pan+1; ) {
			int computer = (int)(Math.random() * 3) + 1;
			//System.out.println("���������� �� �ϳ� �Է�: ");
			String user = s.nextLine();
			//���⿡ �����̰� �ʿ��Ѱ� ����;;;;;;;;;;;;;;;;;;;;;;;
			switch (user) {
				case "����":
					if (computer==3){
						u_win++;
						System.out.println("�̰���ϴ�!!!");
						i++;
					}else if (computer==2) {
						u_win--;
						System.out.println("�����ϴ�!!!");
						i++;
					}else { 
						System.out.println("�����ϴ�!!!");
					}
					break;
					
				case "����":
					if (computer==1) {
						u_win++;
						System.out.println("�̰���ϴ�!!!");
						i++;
					}else if (computer==3) {
						u_win--;
						System.out.println("�����ϴ�!!!");
						i++;
					}else { 
						System.out.println("�����ϴ�!!!");
					}
					break;

				case "��":
					if (computer==2) {
						u_win++;
						System.out.println("�̰���ϴ�!!!");
						i++;
					}else if (computer==1) {
						u_win--;
						System.out.println("�����ϴ�!!!");
						i++;
					}else { 
						System.out.println("�����ϴ�!!!");
					}
					break;
				default:
					//System.out.println("����1, ����2, ��3 �߿��� �Է����ּ���!!");
					break;
			}
			System.out.println("���������� �� �ϳ� �Է�: ");
			
			if(Math.abs(u_win) > (pan-i) ) {
				if (u_win>0) {
					System.out.println("###����� ��!!!");
				}else {
					System.out.println("###��ǻ�� ��!!!");
					break;
				}
			}
		}
		
	}


}